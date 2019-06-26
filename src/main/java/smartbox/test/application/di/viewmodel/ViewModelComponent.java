package smartbox.test.application.di.viewmodel;

import dagger.Subcomponent;
import smartbox.test.application.viewmodel.EventsFragmentViewModel;
import smartbox.test.application.viewmodel.InformationFragmentViewModel;
import smartbox.test.application.viewmodel.SplashActivityViewModel;

@Subcomponent
public interface ViewModelComponent {

    @Subcomponent.Builder
    interface Builder {
        ViewModelComponent build();
    }

    SplashActivityViewModel splashActivityViewModel();

    EventsFragmentViewModel eventsFragmentViewModel();

    InformationFragmentViewModel informationFragmentViewModel();
}
