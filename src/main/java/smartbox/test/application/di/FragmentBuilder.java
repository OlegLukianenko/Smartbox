package smartbox.test.application.di;

import android.support.v4.app.Fragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import smartbox.test.application.app.home.InformationFragment;
import smartbox.test.application.app.home.MapFragment;
import smartbox.test.application.app.home.ShopsFragment;
import smartbox.test.application.app.home.VievPagerFragment;
import smartbox.test.application.app.home.EventsFragment;
import smartbox.test.application.di.home.map.MapFragmentComponent;
import smartbox.test.application.di.home.profile.ProfileFragmentComponent;
import smartbox.test.application.di.home.event.EventsFragmentComponent;
import smartbox.test.application.di.home.shop.ShopsFragmentComponent;
import smartbox.test.application.di.home.viewPager.ViewPagerFragmentComponent;

@Module
public abstract class FragmentBuilder {

    @Binds
    @IntoMap
    @FragmentKey(EventsFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> bindUserFragment(EventsFragmentComponent.Builder builder);

    @Binds
    @IntoMap
    @FragmentKey(InformationFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> bindProfileFragment(ProfileFragmentComponent.Builder builder);

    @Binds
    @IntoMap
    @FragmentKey(VievPagerFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> bindViewPagerFragment(ViewPagerFragmentComponent.Builder builder);

    @Binds
    @IntoMap
    @FragmentKey(ShopsFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> bindShopsFragment(ShopsFragmentComponent.Builder builder);

    @Binds
    @IntoMap
    @FragmentKey(MapFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> bindMapFragment(MapFragmentComponent.Builder builder);

}


