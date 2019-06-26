package smartbox.test.application.di.splash;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;

import dagger.Module;
import dagger.Provides;
import smartbox.test.application.app.splash.SplashActivity;
import smartbox.test.application.viewmodel.SplashActivityViewModel;

@Module
public class SplashModule {

    @Provides
    SplashActivityViewModel provideSplashViewModel(SplashActivity activity, ViewModelProvider.Factory factory) {
        return ViewModelProviders.of(activity, factory).get(SplashActivityViewModel.class);
    }

}
