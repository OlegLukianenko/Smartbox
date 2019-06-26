package smartbox.test.application.di.home.event;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import smartbox.test.application.app.home.EventsFragment;

@Subcomponent(modules = EventsFragmentModule.class)
public interface EventsFragmentComponent extends AndroidInjector<EventsFragment> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<EventsFragment> {}
}

