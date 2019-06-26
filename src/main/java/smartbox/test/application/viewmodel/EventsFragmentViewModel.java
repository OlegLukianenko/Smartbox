package smartbox.test.application.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import java.util.List;

import javax.inject.Inject;

import smartbox.test.application.data.repository.RepositoryApi;
import smartbox.test.application.data.retrofit.ResponseWrap;
import smartbox.test.application.data.retrofit.response.EventShop;


public class EventsFragmentViewModel extends ViewModel {

    @Inject
    RepositoryApi repositoryApi;

    @Inject
    public EventsFragmentViewModel() {
    }

    private MutableLiveData<Boolean> progressBarVisibility = new MutableLiveData<>();
    private MutableLiveData<ResponseWrap<List<EventShop>>> eventShopMutableLiveData = new MutableLiveData<>();


    public void sendRequest() {
        repositoryApi.getResponse(eventShopMutableLiveData);
    }

    public MutableLiveData<ResponseWrap<List<EventShop>>> getEventShopMutableLiveData() {
        return eventShopMutableLiveData;
    }

    public MutableLiveData<Boolean> getProgressBarEvent() {
        return progressBarVisibility;
    }

}
