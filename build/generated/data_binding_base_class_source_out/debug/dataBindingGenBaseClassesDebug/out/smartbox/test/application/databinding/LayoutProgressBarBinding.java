package smartbox.test.application.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import java.lang.Deprecated;
import java.lang.Object;
import smartbox.test.application.viewmodel.EventsFragmentViewModel;

public abstract class LayoutProgressBarBinding extends ViewDataBinding {
  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final ConstraintLayout progressBarWrap;

  @Bindable
  protected EventsFragmentViewModel mViewModel;

  @Bindable
  protected View mView;

  protected LayoutProgressBarBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ProgressBar progressBar, ConstraintLayout progressBarWrap) {
    super(_bindingComponent, _root, _localFieldCount);
    this.progressBar = progressBar;
    this.progressBarWrap = progressBarWrap;
  }

  public abstract void setViewModel(@Nullable EventsFragmentViewModel viewModel);

  @Nullable
  public EventsFragmentViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setView(@Nullable View view);

  @Nullable
  public View getView() {
    return mView;
  }

  @NonNull
  public static LayoutProgressBarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_progress_bar, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LayoutProgressBarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LayoutProgressBarBinding>inflateInternal(inflater, smartbox.test.application.R.layout.layout_progress_bar, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutProgressBarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_progress_bar, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LayoutProgressBarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LayoutProgressBarBinding>inflateInternal(inflater, smartbox.test.application.R.layout.layout_progress_bar, null, false, component);
  }

  public static LayoutProgressBarBinding bind(@NonNull View view) {
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
  public static LayoutProgressBarBinding bind(@NonNull View view, @Nullable Object component) {
    return (LayoutProgressBarBinding)bind(component, view, smartbox.test.application.R.layout.layout_progress_bar);
  }
}
