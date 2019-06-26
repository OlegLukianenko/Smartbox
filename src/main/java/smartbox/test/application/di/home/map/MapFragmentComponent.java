package smartbox.test.application.di.home.map;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import smartbox.test.application.app.home.MapFragment;
import smartbox.test.application.di.home.profile.ProfileFragmentModule;


@Subcomponent(modules = ProfileFragmentModule.class)
public interface MapFragmentComponent extends AndroidInjector<MapFragment> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MapFragment> {}
}
