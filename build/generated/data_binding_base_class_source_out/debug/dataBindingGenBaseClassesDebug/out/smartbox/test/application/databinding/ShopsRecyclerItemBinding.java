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
import smartbox.test.application.app.home.adapter.ShopsRecyclerAdapter;
import smartbox.test.application.data.retrofit.response.EventShop;

public abstract class ShopsRecyclerItemBinding extends ViewDataBinding {
  @NonNull
  public final ImageView image;

  @NonNull
  public final TextView shortDescription;

  @NonNull
  public final TextView title;

  @NonNull
  public final ConstraintLayout wrapContainer;

  @Bindable
  protected EventShop mData;

  @Bindable
  protected ShopsRecyclerAdapter mAdapter;

  protected ShopsRecyclerItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView image, TextView shortDescription, TextView title, ConstraintLayout wrapContainer) {
    super(_bindingComponent, _root, _localFieldCount);
    this.image = image;
    this.shortDescription = shortDescription;
    this.title = title;
    this.wrapContainer = wrapContainer;
  }

  public abstract void setData(@Nullable EventShop data);

  @Nullable
  public EventShop getData() {
    return mData;
  }

  public abstract void setAdapter(@Nullable ShopsRecyclerAdapter adapter);

  @Nullable
  public ShopsRecyclerAdapter getAdapter() {
    return mAdapter;
  }

  @NonNull
  public static ShopsRecyclerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.shops_recycler_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ShopsRecyclerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ShopsRecyclerItemBinding>inflateInternal(inflater, smartbox.test.application.R.layout.shops_recycler_item, root, attachToRoot, component);
  }

  @NonNull
  public static ShopsRecyclerItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.shops_recycler_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ShopsRecyclerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ShopsRecyclerItemBinding>inflateInternal(inflater, smartbox.test.application.R.layout.shops_recycler_item, null, false, component);
  }

  public static ShopsRecyclerItemBinding bind(@NonNull View view) {
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
  public static ShopsRecyclerItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (ShopsRecyclerItemBinding)bind(component, view, smartbox.test.application.R.layout.shops_recycler_item);
  }
}
