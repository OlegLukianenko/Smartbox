package smartbox.test.application.di.home.profile;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;

import dagger.Module;
import dagger.Provides;
import smartbox.test.application.app.home.InformationFragment;
import smartbox.test.application.viewmodel.InformationFragmentViewModel;

@Module
public class ProfileFragmentModule {
    @Provides
    InformationFragmentViewModel provideViewModel(InformationFragment fragment, ViewModelProvider.Factory factory) {
        return ViewModelProviders.of(fragment, factory).get(InformationFragmentViewModel.class);
    }

}
