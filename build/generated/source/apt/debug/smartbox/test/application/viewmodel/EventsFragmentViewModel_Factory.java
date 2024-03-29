// Generated by Dagger (https://google.github.io/dagger).
package smartbox.test.application.viewmodel;

import dagger.internal.Factory;
import javax.inject.Provider;
import smartbox.test.application.data.repository.RepositoryApi;

public final class EventsFragmentViewModel_Factory implements Factory<EventsFragmentViewModel> {
  private final Provider<RepositoryApi> repositoryApiProvider;

  public EventsFragmentViewModel_Factory(Provider<RepositoryApi> repositoryApiProvider) {
    this.repositoryApiProvider = repositoryApiProvider;
  }

  @Override
  public EventsFragmentViewModel get() {
    return provideInstance(repositoryApiProvider);
  }

  public static EventsFragmentViewModel provideInstance(
      Provider<RepositoryApi> repositoryApiProvider) {
    EventsFragmentViewModel instance = new EventsFragmentViewModel();
    EventsFragmentViewModel_MembersInjector.injectRepositoryApi(
        instance, repositoryApiProvider.get());
    return instance;
  }

  public static EventsFragmentViewModel_Factory create(
      Provider<RepositoryApi> repositoryApiProvider) {
    return new EventsFragmentViewModel_Factory(repositoryApiProvider);
  }

  public static EventsFragmentViewModel newEventsFragmentViewModel() {
    return new EventsFragmentViewModel();
  }
}
