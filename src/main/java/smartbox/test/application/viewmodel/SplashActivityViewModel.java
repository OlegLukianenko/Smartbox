package smartbox.test.application.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import javax.inject.Inject;
import smartbox.test.application.data.repository.RepositoryApi;

public class SplashActivityViewModel extends ViewModel {

    @Inject
    RepositoryApi repositoryApi;

    @Inject
    public SplashActivityViewModel() {
    }

    private MutableLiveData<Boolean> progressBarVisibility = new MutableLiveData<>();
    private MutableLiveData<Boolean> internetIsAvailable = new MutableLiveData<>();

    public MutableLiveData<Boolean> getInternetIsAvailable() {
        return internetIsAvailable;
    }

    public MutableLiveData<Boolean> getProgressBarEvent() {
        return progressBarVisibility;
    }


}
