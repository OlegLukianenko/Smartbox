package smartbox.test.application.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.Deprecated;
import java.lang.Object;
import smartbox.test.application.app.home.ShopsFragment;
import smartbox.test.application.viewmodel.EventsFragmentViewModel;

public abstract class FragmentShopsBinding extends ViewDataBinding {
  @NonNull
  public final LayoutProgressBarBinding includeLayoutProgressBar;

  @NonNull
  public final RecyclerView recycleView;

  @Bindable
  protected EventsFragmentViewModel mViewModel;

  @Bindable
  protected ShopsFragment mHandler;

  protected FragmentShopsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LayoutProgressBarBinding includeLayoutProgressBar, RecyclerView recycleView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.includeLayoutProgressBar = includeLayoutProgressBar;
    setContainedBinding(this.includeLayoutProgressBar);;
    this.recycleView = recycleView;
  }

  public abstract void setViewModel(@Nullable EventsFragmentViewModel viewModel);

  @Nullable
  public EventsFragmentViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setHandler(@Nullable ShopsFragment handler);

  @Nullable
  public ShopsFragment getHandler() {
    return mHandler;
  }

  @NonNull
  public static FragmentShopsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_shops, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentShopsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentShopsBinding>inflateInternal(inflater, smartbox.test.application.R.layout.fragment_shops, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentShopsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_shops, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentShopsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentShopsBinding>inflateInternal(inflater, smartbox.test.application.R.layout.fragment_shops, null, false, component);
  }

  public static FragmentShopsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentShopsBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentShopsBinding)bind(component, view, smartbox.test.application.R.layout.fragment_shops);
  }
}
