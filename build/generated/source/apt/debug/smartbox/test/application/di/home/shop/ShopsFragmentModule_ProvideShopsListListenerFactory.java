// Generated by Dagger (https://google.github.io/dagger).
package smartbox.test.application.di.home.shop;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import smartbox.test.application.app.home.ShopsFragment;
import smartbox.test.application.app.home.adapter.ShopsRecyclerAdapter;

public final class ShopsFragmentModule_ProvideShopsListListenerFactory
    implements Factory<ShopsRecyclerAdapter.UserItemListListener> {
  private final ShopsFragmentModule module;

  private final Provider<ShopsFragment> fragmentProvider;

  public ShopsFragmentModule_ProvideShopsListListenerFactory(
      ShopsFragmentModule module, Provider<ShopsFragment> fragmentProvider) {
    this.module = module;
    this.fragmentProvider = fragmentProvider;
  }

  @Override
  public ShopsRecyclerAdapter.UserItemListListener get() {
    return provideInstance(module, fragmentProvider);
  }

  public static ShopsRecyclerAdapter.UserItemListListener provideInstance(
      ShopsFragmentModule module, Provider<ShopsFragment> fragmentProvider) {
    return proxyProvideShopsListListener(module, fragmentProvider.get());
  }

  public static ShopsFragmentModule_ProvideShopsListListenerFactory create(
      ShopsFragmentModule module, Provider<ShopsFragment> fragmentProvider) {
    return new ShopsFragmentModule_ProvideShopsListListenerFactory(module, fragmentProvider);
  }

  public static ShopsRecyclerAdapter.UserItemListListener proxyProvideShopsListListener(
      ShopsFragmentModule instance, ShopsFragment fragment) {
    return Preconditions.checkNotNull(
        instance.provideShopsListListener(fragment),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}