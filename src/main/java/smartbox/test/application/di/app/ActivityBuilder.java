package smartbox.test.application.di.app;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import smartbox.test.application.app.home.MainActivity;
import smartbox.test.application.app.splash.SplashActivity;
import smartbox.test.application.di.home.mainActivity.MainActivityComponent;
import smartbox.test.application.di.splash.SplashActivityComponent;

@Module
public abstract class ActivityBuilder {

    @Binds
    @IntoMap
    @ActivityKey(SplashActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindSplashActivity(SplashActivityComponent.Builder builder);

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivity(MainActivityComponent.Builder builder);

}