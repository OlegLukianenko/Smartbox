package smartbox.test.application;

import android.databinding.DataBinderMapper;
import android.databinding.DataBindingComponent;
import android.databinding.ViewDataBinding;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import smartbox.test.application.databinding.ActivityMainBindingImpl;
import smartbox.test.application.databinding.ActivitySplashBindingImpl;
import smartbox.test.application.databinding.EventsRecyclerItemBindingImpl;
import smartbox.test.application.databinding.FragmentEventsBindingImpl;
import smartbox.test.application.databinding.FragmentInformationBindingImpl;
import smartbox.test.application.databinding.FragmentMapBindingImpl;
import smartbox.test.application.databinding.FragmentShopsBindingImpl;
import smartbox.test.application.databinding.FragmentViewPagerBindingImpl;
import smartbox.test.application.databinding.LayoutProgressBarBindingImpl;
import smartbox.test.application.databinding.LayoutSnackBarBindingImpl;
import smartbox.test.application.databinding.ShopsRecyclerItemBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_ACTIVITYSPLASH = 2;

  private static final int LAYOUT_EVENTSRECYCLERITEM = 3;

  private static final int LAYOUT_FRAGMENTEVENTS = 4;

  private static final int LAYOUT_FRAGMENTINFORMATION = 5;

  private static final int LAYOUT_FRAGMENTMAP = 6;

  private static final int LAYOUT_FRAGMENTSHOPS = 7;

  private static final int LAYOUT_FRAGMENTVIEWPAGER = 8;

  private static final int LAYOUT_LAYOUTPROGRESSBAR = 9;

  private static final int LAYOUT_LAYOUTSNACKBAR = 10;

  private static final int LAYOUT_SHOPSRECYCLERITEM = 11;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(11);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(smartbox.test.application.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(smartbox.test.application.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(smartbox.test.application.R.layout.events_recycler_item, LAYOUT_EVENTSRECYCLERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(smartbox.test.application.R.layout.fragment_events, LAYOUT_FRAGMENTEVENTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(smartbox.test.application.R.layout.fragment_information, LAYOUT_FRAGMENTINFORMATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(smartbox.test.application.R.layout.fragment_map, LAYOUT_FRAGMENTMAP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(smartbox.test.application.R.layout.fragment_shops, LAYOUT_FRAGMENTSHOPS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(smartbox.test.application.R.layout.fragment_view_pager, LAYOUT_FRAGMENTVIEWPAGER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(smartbox.test.application.R.layout.layout_progress_bar, LAYOUT_LAYOUTPROGRESSBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(smartbox.test.application.R.layout.layout_snack_bar, LAYOUT_LAYOUTSNACKBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(smartbox.test.application.R.layout.shops_recycler_item, LAYOUT_SHOPSRECYCLERITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASH: {
          if ("layout/activity_splash_0".equals(tag)) {
            return new ActivitySplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_EVENTSRECYCLERITEM: {
          if ("layout/events_recycler_item_0".equals(tag)) {
            return new EventsRecyclerItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for events_recycler_item is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTEVENTS: {
          if ("layout/fragment_events_0".equals(tag)) {
            return new FragmentEventsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_events is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTINFORMATION: {
          if ("layout/fragment_information_0".equals(tag)) {
            return new FragmentInformationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_information is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMAP: {
          if ("layout/fragment_map_0".equals(tag)) {
            return new FragmentMapBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_map is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSHOPS: {
          if ("layout/fragment_shops_0".equals(tag)) {
            return new FragmentShopsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_shops is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTVIEWPAGER: {
          if ("layout/fragment_view_pager_0".equals(tag)) {
            return new FragmentViewPagerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_view_pager is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTPROGRESSBAR: {
          if ("layout/layout_progress_bar_0".equals(tag)) {
            return new LayoutProgressBarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_progress_bar is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTSNACKBAR: {
          if ("layout/layout_snack_bar_0".equals(tag)) {
            return new LayoutSnackBarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_snack_bar is invalid. Received: " + tag);
        }
        case  LAYOUT_SHOPSRECYCLERITEM: {
          if ("layout/shops_recycler_item_0".equals(tag)) {
            return new ShopsRecyclerItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for shops_recycler_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new com.android.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(7);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "handler");
      sKeys.put(2, "view");
      sKeys.put(3, "adapter");
      sKeys.put(4, "data");
      sKeys.put(5, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(11);

    static {
      sKeys.put("layout/activity_main_0", smartbox.test.application.R.layout.activity_main);
      sKeys.put("layout/activity_splash_0", smartbox.test.application.R.layout.activity_splash);
      sKeys.put("layout/events_recycler_item_0", smartbox.test.application.R.layout.events_recycler_item);
      sKeys.put("layout/fragment_events_0", smartbox.test.application.R.layout.fragment_events);
      sKeys.put("layout/fragment_information_0", smartbox.test.application.R.layout.fragment_information);
      sKeys.put("layout/fragment_map_0", smartbox.test.application.R.layout.fragment_map);
      sKeys.put("layout/fragment_shops_0", smartbox.test.application.R.layout.fragment_shops);
      sKeys.put("layout/fragment_view_pager_0", smartbox.test.application.R.layout.fragment_view_pager);
      sKeys.put("layout/layout_progress_bar_0", smartbox.test.application.R.layout.layout_progress_bar);
      sKeys.put("layout/layout_snack_bar_0", smartbox.test.application.R.layout.layout_snack_bar);
      sKeys.put("layout/shops_recycler_item_0", smartbox.test.application.R.layout.shops_recycler_item);
    }
  }
}
