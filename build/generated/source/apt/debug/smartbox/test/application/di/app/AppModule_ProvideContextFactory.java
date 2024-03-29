// Generated by Dagger (https://google.github.io/dagger).
package smartbox.test.application.di.app;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import smartbox.test.application.app.App;

public final class AppModule_ProvideContextFactory implements Factory<Context> {
  private final AppModule module;

  private final Provider<App> appProvider;

  public AppModule_ProvideContextFactory(AppModule module, Provider<App> appProvider) {
    this.module = module;
    this.appProvider = appProvider;
  }

  @Override
  public Context get() {
    return provideInstance(module, appProvider);
  }

  public static Context provideInstance(AppModule module, Provider<App> appProvider) {
    return proxyProvideContext(module, appProvider.get());
  }

  public static AppModule_ProvideContextFactory create(
      AppModule module, Provider<App> appProvider) {
    return new AppModule_ProvideContextFactory(module, appProvider);
  }

  public static Context proxyProvideContext(AppModule instance, App app) {
    return Preconditions.checkNotNull(
        instance.provideContext(app), "Cannot return null from a non-@Nullable @Provides method");
  }
}
