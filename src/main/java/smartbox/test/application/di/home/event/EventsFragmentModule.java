package smartbox.test.application.di.home.event;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;

import dagger.Module;
import dagger.Provides;
import smartbox.test.application.app.home.EventsFragment;
import smartbox.test.application.app.home.adapter.EventsRecyclerAdapter;
import smartbox.test.application.viewmodel.EventsFragmentViewModel;

@Module
public class EventsFragmentModule {

    @Provides
    EventsFragmentViewModel provideViewModel(EventsFragment fragment, ViewModelProvider.Factory factory) {
        return ViewModelProviders.of(fragment, factory).get(EventsFragmentViewModel.class);
    }

    @Provides
    EventsRecyclerAdapter provideUserAdapter(EventsRecyclerAdapter.UserItemListListener listener) {
        return new EventsRecyclerAdapter(listener);
    }

    @Provides
    EventsRecyclerAdapter.UserItemListListener provideUserListListener(EventsFragment fragment) {
        return fragment;
    }
}
