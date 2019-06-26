package smartbox.test.application.di.home.shop;


import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;

import dagger.Module;
import dagger.Provides;
import smartbox.test.application.app.home.ShopsFragment;
import smartbox.test.application.app.home.adapter.ShopsRecyclerAdapter;
import smartbox.test.application.viewmodel.EventsFragmentViewModel;

@Module
public class ShopsFragmentModule {

    @Provides
    EventsFragmentViewModel provideViewModel(ShopsFragment fragment, ViewModelProvider.Factory factory) {
        return ViewModelProviders.of(fragment, factory).get(EventsFragmentViewModel.class);
    }

    @Provides
   ShopsRecyclerAdapter provideShopsAdapter(ShopsRecyclerAdapter.UserItemListListener listener) {
        return new ShopsRecyclerAdapter(listener);
    }

    @Provides
    ShopsRecyclerAdapter.UserItemListListener provideShopsListListener(ShopsFragment fragment) {
        return fragment;
    }
}
