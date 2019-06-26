// Generated by Dagger (https://google.github.io/dagger).
package smartbox.test.application.di.app;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

public final class DataModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final DataModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public DataModule_ProvideRetrofitFactory(
      DataModule module, Provider<OkHttpClient> okHttpClientProvider) {
    this.module = module;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public Retrofit get() {
    return provideInstance(module, okHttpClientProvider);
  }

  public static Retrofit provideInstance(
      DataModule module, Provider<OkHttpClient> okHttpClientProvider) {
    return proxyProvideRetrofit(module, okHttpClientProvider.get());
  }

  public static DataModule_ProvideRetrofitFactory create(
      DataModule module, Provider<OkHttpClient> okHttpClientProvider) {
    return new DataModule_ProvideRetrofitFactory(module, okHttpClientProvider);
  }

  public static Retrofit proxyProvideRetrofit(DataModule instance, OkHttpClient okHttpClient) {
    return Preconditions.checkNotNull(
        instance.provideRetrofit(okHttpClient),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
