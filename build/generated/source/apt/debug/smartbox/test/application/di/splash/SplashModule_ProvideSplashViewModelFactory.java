// Generated by Dagger (https://google.github.io/dagger).
package smartbox.test.application.di.splash;

import android.arch.lifecycle.ViewModelProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import smartbox.test.application.app.splash.SplashActivity;
import smartbox.test.application.viewmodel.SplashActivityViewModel;

public final class SplashModule_ProvideSplashViewModelFactory
    implements Factory<SplashActivityViewModel> {
  private final SplashModule module;

  private final Provider<SplashActivity> activityProvider;

  private final Provider<ViewModelProvider.Factory> factoryProvider;

  public SplashModule_ProvideSplashViewModelFactory(
      SplashModule module,
      Provider<SplashActivity> activityProvider,
      Provider<ViewModelProvider.Factory> factoryProvider) {
    this.module = module;
    this.activityProvider = activityProvider;
    this.factoryProvider = factoryProvider;
  }

  @Override
  public SplashActivityViewModel get() {
    return provideInstance(module, activityProvider, factoryProvider);
  }

  public static SplashActivityViewModel provideInstance(
      SplashModule module,
      Provider<SplashActivity> activityProvider,
      Provider<ViewModelProvider.Factory> factoryProvider) {
    return proxyProvideSplashViewModel(module, activityProvider.get(), factoryProvider.get());
  }

  public static SplashModule_ProvideSplashViewModelFactory create(
      SplashModule module,
      Provider<SplashActivity> activityProvider,
      Provider<ViewModelProvider.Factory> factoryProvider) {
    return new SplashModule_ProvideSplashViewModelFactory(
        module, activityProvider, factoryProvider);
  }

  public static SplashActivityViewModel proxyProvideSplashViewModel(
      SplashModule instance, SplashActivity activity, ViewModelProvider.Factory factory) {
    return Preconditions.checkNotNull(
        instance.provideSplashViewModel(activity, factory),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
