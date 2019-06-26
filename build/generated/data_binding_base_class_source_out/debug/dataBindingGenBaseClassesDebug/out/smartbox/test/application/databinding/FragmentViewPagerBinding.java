package smartbox.test.application.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentViewPagerBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout headerBackground;

  @NonNull
  public final View headerResizer;

  @NonNull
  public final TabLayout tabs;

  @NonNull
  public final TextView textPricing;

  @NonNull
  public final ViewPager viewPagerStatistics;

  protected FragmentViewPagerBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout headerBackground, View headerResizer, TabLayout tabs, TextView textPricing,
      ViewPager viewPagerStatistics) {
    super(_bindingComponent, _root, _localFieldCount);
    this.headerBackground = headerBackground;
    this.headerResizer = headerResizer;
    this.tabs = tabs;
    this.textPricing = textPricing;
    this.viewPagerStatistics = viewPagerStatistics;
  }

  @NonNull
  public static FragmentViewPagerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_view_pager, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentViewPagerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentViewPagerBinding>inflateInternal(inflater, smartbox.test.application.R.layout.fragment_view_pager, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentViewPagerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_view_pager, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentViewPagerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentViewPagerBinding>inflateInternal(inflater, smartbox.test.application.R.layout.fragment_view_pager, null, false, component);
  }

  public static FragmentViewPagerBinding bind(@NonNull View view) {
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
  public static FragmentViewPagerBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentViewPagerBinding)bind(component, view, smartbox.test.application.R.layout.fragment_view_pager);
  }
}
