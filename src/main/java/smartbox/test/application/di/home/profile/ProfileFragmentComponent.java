package smartbox.test.application.di.home.profile;


import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import smartbox.test.application.app.home.InformationFragment;

@Subcomponent(modules = ProfileFragmentModule.class)
public interface ProfileFragmentComponent extends AndroidInjector<InformationFragment> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<InformationFragment> {}
}
