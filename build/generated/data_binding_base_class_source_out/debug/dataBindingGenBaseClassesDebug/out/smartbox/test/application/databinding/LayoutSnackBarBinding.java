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
import android.widget.TextView;
import java.lang.Deprecated;
import java.lang.Object;
import smartbox.test.application.viewmodel.SplashActivityViewModel;

public abstract class LayoutSnackBarBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout containerWrap;

  @NonNull
  public final TextView message;

  @Bindable
  protected SplashActivityViewModel mViewModel;

  protected LayoutSnackBarBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout containerWrap, TextView message) {
    super(_bindingComponent, _root, _localFieldCount);
    this.containerWrap = containerWrap;
    this.message = message;
  }

  public abstract void setViewModel(@Nullable SplashActivityViewModel viewModel);

  @Nullable
  public SplashActivityViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static LayoutSnackBarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_snack_bar, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LayoutSnackBarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LayoutSnackBarBinding>inflateInternal(inflater, smartbox.test.application.R.layout.layout_snack_bar, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutSnackBarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_snack_bar, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LayoutSnackBarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LayoutSnackBarBinding>inflateInternal(inflater, smartbox.test.application.R.layout.layout_snack_bar, null, false, component);
  }

  public static LayoutSnackBarBinding bind(@NonNull View view) {
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
  public static LayoutSnackBarBinding bind(@NonNull View view, @Nullable Object component) {
    return (LayoutSnackBarBinding)bind(component, view, smartbox.test.application.R.layout.layout_snack_bar);
  }
}
