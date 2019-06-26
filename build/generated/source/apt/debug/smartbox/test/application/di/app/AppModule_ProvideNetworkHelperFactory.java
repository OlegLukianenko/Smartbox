// Generated by Dagger (https://google.github.io/dagger).
package smartbox.test.application.di.app;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import smartbox.test.application.app.App;
import smartbox.test.application.utils.NetworkHelper;

public final class AppModule_ProvideNetworkHelperFactory implements Factory<NetworkHelper> {
  private final AppModule module;

  private final Provider<App> appProvider;

  public AppModule_ProvideNetworkHelperFactory(AppModule module, Provider<App> appProvider) {
    this.module = module;
    this.appProvider = appProvider;
  }

  @Override
  public NetworkHelper get() {
    return provideInstance(module, appProvider);
  }

  public static NetworkHelper provideInstance(AppModule module, Provider<App> appProvider) {
    return proxyProvideNetworkHelper(module, appProvider.get());
  }

  public static AppModule_ProvideNetworkHelperFactory create(
      AppModule module, Provider<App> appProvider) {
    return new AppModule_ProvideNetworkHelperFactory(module, appProvider);
  }

  public static NetworkHelper proxyProvideNetworkHelper(AppModule instance, App app) {
    return Preconditions.checkNotNull(
        instance.provideNetworkHelper(app),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}