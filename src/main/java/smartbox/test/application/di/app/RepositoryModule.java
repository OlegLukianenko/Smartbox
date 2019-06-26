package smartbox.test.application.di.app;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import smartbox.test.application.data.repository.RepositoryImpl;
import smartbox.test.application.data.repository.RepositoryApi;

@Module
public abstract class RepositoryModule {

    @Binds
    @Singleton
    public abstract RepositoryApi provideServerApi(RepositoryImpl repositoryImpl);
}
