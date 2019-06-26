package smartbox.test.application.di.home.viewPager;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;

import dagger.Module;
import dagger.Provides;
import smartbox.test.application.app.home.VievPagerFragment;
import smartbox.test.application.viewmodel.EventsFragmentViewModel;

@Module
public class ViewPagerFragmentModule {

    @Provides
    EventsFragmentViewModel provideViewModel(VievPagerFragment fragment, ViewModelProvider.Factory factory) {
        return ViewModelProviders.of(fragment, factory).get(EventsFragmentViewModel.class);
    }

}
