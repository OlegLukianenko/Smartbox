package smartbox.test.application.di.home.mainActivity;

import dagger.Module;
import smartbox.test.application.di.home.map.MapFragmentComponent;
import smartbox.test.application.di.home.profile.ProfileFragmentComponent;
import smartbox.test.application.di.home.event.EventsFragmentComponent;
import smartbox.test.application.di.home.shop.ShopsFragmentComponent;
import smartbox.test.application.di.home.viewPager.ViewPagerFragmentComponent;

@Module (subcomponents = {
        EventsFragmentComponent.class,
        ProfileFragmentComponent.class,
        ViewPagerFragmentComponent.class,
        ShopsFragmentComponent.class,
        MapFragmentComponent.class})
public class MainActivityModule {

}
