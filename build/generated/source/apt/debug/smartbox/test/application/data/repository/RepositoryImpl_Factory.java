// Generated by Dagger (https://google.github.io/dagger).
package smartbox.test.application.data.repository;

import dagger.internal.Factory;
import javax.inject.Provider;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import smartbox.test.application.data.retrofit.APIError;
import smartbox.test.application.data.retrofit.ServerApi;

public final class RepositoryImpl_Factory implements Factory<RepositoryImpl> {
  private final Provider<ServerApi> serverApiProvider;

  private final Provider<Converter<ResponseBody, APIError>> converterProvider;

  public RepositoryImpl_Factory(
      Provider<ServerApi> serverApiProvider,
      Provider<Converter<ResponseBody, APIError>> converterProvider) {
    this.serverApiProvider = serverApiProvider;
    this.converterProvider = converterProvider;
  }

  @Override
  public RepositoryImpl get() {
    return provideInstance(serverApiProvider, converterProvider);
  }

  public static RepositoryImpl provideInstance(
      Provider<ServerApi> serverApiProvider,
      Provider<Converter<ResponseBody, APIError>> converterProvider) {
    RepositoryImpl instance = new RepositoryImpl();
    RepositoryImpl_MembersInjector.injectServerApi(instance, serverApiProvider.get());
    RepositoryImpl_MembersInjector.injectConverter(instance, converterProvider.get());
    return instance;
  }

  public static RepositoryImpl_Factory create(
      Provider<ServerApi> serverApiProvider,
      Provider<Converter<ResponseBody, APIError>> converterProvider) {
    return new RepositoryImpl_Factory(serverApiProvider, converterProvider);
  }

  public static RepositoryImpl newRepositoryImpl() {
    return new RepositoryImpl();
  }
}
