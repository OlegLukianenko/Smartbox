package smartbox.test.application.di.home.viewPager;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import smartbox.test.application.app.home.VievPagerFragment;


@Subcomponent(modules = ViewPagerFragmentModule.class)
public interface ViewPagerFragmentComponent extends AndroidInjector<VievPagerFragment> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<VievPagerFragment> {}
}


