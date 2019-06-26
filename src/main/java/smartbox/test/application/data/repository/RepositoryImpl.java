package smartbox.test.application.data.repository;

import android.arch.lifecycle.MutableLiveData;
import android.text.TextUtils;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.List;

import javax.inject.Inject;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Converter;
import retrofit2.Response;
import smartbox.test.application.data.retrofit.APIError;
import smartbox.test.application.data.retrofit.ResponseWrap;
import smartbox.test.application.data.retrofit.ServerApi;
import smartbox.test.application.data.retrofit.response.EventShop;

import static smartbox.test.application.app.home.InformationFragment.TIMEOUT_CODE;

public class RepositoryImpl implements RepositoryApi {

    @Inject
    ServerApi serverApi;

    @Inject
    protected Converter<ResponseBody, APIError> converter;
    private static final String UNKNOWN_ERROR = "Unknown error: ";

    @Inject
    public RepositoryImpl() {
    }


    @Override
    public void getResponse(MutableLiveData<ResponseWrap<List<EventShop>>> eventMutableLiveData) {
        Call<List<EventShop>> messages = serverApi.getResponse();
        messages.enqueue(new Callback<List<EventShop>>() {
            @Override
            public void onResponse(Call<List<EventShop>> call, Response<List<EventShop>> response) {
                ResponseWrap<List<EventShop>> responseWrap;
                if (response.isSuccessful()) {
                    responseWrap = new ResponseWrap<>(response.isSuccessful(), response.code(), response.body());
                } else {
                    responseWrap = new ResponseWrap<>(response.isSuccessful(), response.code(), getErrorMessage(response));
                }

                eventMutableLiveData.postValue(responseWrap);
            }

            @Override
            public void onFailure(Call<List<EventShop>> call, Throwable t) {
                ResponseWrap<List<EventShop>> responseWrap;

                if (t instanceof SocketTimeoutException) {
                    responseWrap = new ResponseWrap<>(false, TIMEOUT_CODE, null, t.getMessage());
                } else {
                    responseWrap = new ResponseWrap<>(false, 0, null, t.getMessage());
                }

                eventMutableLiveData.postValue(responseWrap);
            }
        });
    }


    private String getErrorMessage(Response<?> response) {
        String responseErrorMessage = null;

        try {
            APIError error = converter.convert(response.errorBody());
            if (!TextUtils.isEmpty(error.getMessage())) {
                responseErrorMessage = error.getMessage();
            }
        } catch (IOException e) {
            return UNKNOWN_ERROR + response.code();
        }

        return responseErrorMessage;
    }

}
