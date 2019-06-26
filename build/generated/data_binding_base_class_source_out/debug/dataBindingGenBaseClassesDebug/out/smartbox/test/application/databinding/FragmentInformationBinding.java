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
import android.widget.ScrollView;
import android.widget.TextView;
import java.lang.Deprecated;
import java.lang.Object;
import smartbox.test.application.app.home.InformationFragment;
import smartbox.test.application.data.retrofit.response.EventShop;
import smartbox.test.application.viewmodel.InformationFragmentViewModel;

public abstract class FragmentInformationBinding extends ViewDataBinding {
  @NonNull
  public final ImageView backArrow;

  @NonNull
  public final View buttonLocation;

  @NonNull
  public final TextView description;

  @NonNull
  public final ConstraintLayout headerBackground;

  @NonNull
  public final View headerResizer;

  @NonNull
  public final ImageView profileImage;

  @NonNull
  public final ConstraintLayout scrollContainer;

  @NonNull
  public final ScrollView scrollView2;

  @NonNull
  public final TextView shortDescription;

  @NonNull
  public final TextView textButton;

  @NonNull
  public final TextView textPricing;

  @NonNull
  public final TextView title;

  @Bindable
  protected EventShop mData;

  @Bindable
  protected InformationFragmentViewModel mViewModel;

  @Bindable
  protected InformationFragment mHandler;

  protected FragmentInformationBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView backArrow, View buttonLocation, TextView description,
      ConstraintLayout headerBackground, View headerResizer, ImageView profileImage,
      ConstraintLayout scrollContainer, ScrollView scrollView2, TextView shortDescription,
      TextView textButton, TextView textPricing, TextView title) {
    super(_bindingComponent, _root, _localFieldCount);
    this.backArrow = backArrow;
    this.buttonLocation = buttonLocation;
    this.description = description;
    this.headerBackground = headerBackground;
    this.headerResizer = headerResizer;
    this.profileImage = profileImage;
    this.scrollContainer = scrollContainer;
    this.scrollView2 = scrollView2;
    this.shortDescription = shortDescription;
    this.textButton = textButton;
    this.textPricing = textPricing;
    this.title = title;
  }

  public abstract void setData(@Nullable EventShop data);

  @Nullable
  public EventShop getData() {
    return mData;
  }

  public abstract void setViewModel(@Nullable InformationFragmentViewModel viewModel);

  @Nullable
  public InformationFragmentViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setHandler(@Nullable InformationFragment handler);

  @Nullable
  public InformationFragment getHandler() {
    return mHandler;
  }

  @NonNull
  public static FragmentInformationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_information, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentInformationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentInformationBinding>inflateInternal(inflater, smartbox.test.application.R.layout.fragment_information, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentInformationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_information, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentInformationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentInformationBinding>inflateInternal(inflater, smartbox.test.application.R.layout.fragment_information, null, false, component);
  }

  public static FragmentInformationBinding bind(@NonNull View view) {
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
  public static FragmentInformationBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentInformationBinding)bind(component, view, smartbox.test.application.R.layout.fragment_information);
  }
}
