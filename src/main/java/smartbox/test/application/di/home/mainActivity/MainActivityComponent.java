package smartbox.test.application.di.home.mainActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import smartbox.test.application.app.home.MainActivity;
import smartbox.test.application.di.FragmentBuilder;

@Subcomponent(modules = {
        FragmentBuilder.class,
        MainActivityModule.class})

public interface MainActivityComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> { }
}

