package smartbox.test.application.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import javax.inject.Inject;

import smartbox.test.application.data.repository.RepositoryApi;
import smartbox.test.application.data.retrofit.response.EventShop;

public class InformationFragmentViewModel extends ViewModel {

    @Inject
    RepositoryApi repositoryApi;

    @Inject
    public InformationFragmentViewModel() {
    }

    private MutableLiveData<EventShop> profileMutableLiveData = new MutableLiveData<>();


    public MutableLiveData<EventShop> getProfileFromApi() {
        return profileMutableLiveData;
    }


}
