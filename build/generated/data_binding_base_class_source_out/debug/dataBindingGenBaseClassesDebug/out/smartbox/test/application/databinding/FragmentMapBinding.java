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
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.Deprecated;
import java.lang.Object;
import smartbox.test.application.app.home.MapFragment;

public abstract class FragmentMapBinding extends ViewDataBinding {
  @NonNull
  public final ImageView backArrow;

  @NonNull
  public final ConstraintLayout headerBackground;

  @NonNull
  public final View headerResizer;

  @NonNull
  public final TextView textPricing;

  @NonNull
  public final ConstraintLayout wrapContainer;

  @Bindable
  protected MapFragment mHandler;

  protected FragmentMapBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView backArrow, ConstraintLayout headerBackground, View headerResizer,
      TextView textPricing, ConstraintLayout wrapContainer) {
    super(_bindingComponent, _root, _localFieldCount);
    this.backArrow = backArrow;
    this.headerBackground = headerBackground;
    this.headerResizer = headerResizer;
    this.textPricing = textPricing;
    this.wrapContainer = wrapContainer;
  }

  public abstract void setHandler(@Nullable MapFragment handler);

  @Nullable
  public MapFragment getHandler() {
    return mHandler;
  }

  @NonNull
  public static FragmentMapBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_map, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentMapBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentMapBinding>inflateInternal(inflater, smartbox.test.application.R.layout.fragment_map, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentMapBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_map, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentMapBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentMapBinding>inflateInternal(inflater, smartbox.test.application.R.layout.fragment_map, null, false, component);
  }

  public static FragmentMapBinding bind(@NonNull View view) {
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
  public static FragmentMapBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentMapBinding)bind(component, view, smartbox.test.application.R.layout.fragment_map);
  }
}
