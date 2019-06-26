package smartbox.test.application.data.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import smartbox.test.application.data.retrofit.response.EventShop;

public interface ServerApi {

    @GET("TT.json")
    Call<List<EventShop>> getResponse();

}