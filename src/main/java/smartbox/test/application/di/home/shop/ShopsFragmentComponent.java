package smartbox.test.application.di.home.shop;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import smartbox.test.application.app.home.ShopsFragment;


@Subcomponent(modules = ShopsFragmentModule.class)
public interface ShopsFragmentComponent extends AndroidInjector<ShopsFragment> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ShopsFragment> {}
}


