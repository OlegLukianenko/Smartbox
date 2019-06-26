package smartbox.test.application.app.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import smartbox.test.application.R;
import smartbox.test.application.app.home.adapter.PagerAdapter;
import smartbox.test.application.base.BaseFragment;
import smartbox.test.application.databinding.FragmentViewPagerBinding;
import smartbox.test.application.di.viewmodel.Injectable;
import smartbox.test.application.utils.NetworkHelper;
import smartbox.test.application.viewmodel.EventsFragmentViewModel;

public class VievPagerFragment extends BaseFragment<FragmentViewPagerBinding> implements
        Injectable {

    @Inject
    EventsFragmentViewModel viewModel;

    PagerAdapter pagerAdapter;

    @Inject
    protected NetworkHelper networkHelper;

    @Override
    protected int getLayout() {
        return R.layout.fragment_view_pager;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setPages();
        setViewPager();
    }


    private void setPages() {
        List<String> titles = Arrays.asList(getResources().getStringArray(R.array.project_pages));
        List<BaseFragment> fragments = new ArrayList<>();

        EventsFragment tasksListFragment = new EventsFragment();
        tasksListFragment.setArguments(getArguments());
        fragments.add(tasksListFragment);

        ShopsFragment statisticsFragment = new ShopsFragment();
        statisticsFragment.setArguments(getArguments());
        fragments.add(statisticsFragment);

        pagerAdapter = new PagerAdapter(getChildFragmentManager(), titles);
        pagerAdapter.setItems(fragments);
    }

    private void setViewPager() {
        binding.viewPagerStatistics.setAdapter(pagerAdapter);
        binding.tabs.setupWithViewPager(binding.viewPagerStatistics);
    }
}
