package smartbox.test.application.data.repository;

import android.arch.lifecycle.MutableLiveData;

import java.util.List;

import smartbox.test.application.data.retrofit.ResponseWrap;
import smartbox.test.application.data.retrofit.response.EventShop;

public interface RepositoryApi {

     void getResponse(MutableLiveData<ResponseWrap<List<EventShop>>> eventMutableLiveData);

}
