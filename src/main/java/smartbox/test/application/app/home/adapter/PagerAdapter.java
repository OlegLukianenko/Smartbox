package smartbox.test.application.app.home.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import smartbox.test.application.base.BaseFragment;

public class PagerAdapter extends FragmentPagerAdapter {

    private final List<String> titles = new ArrayList<>();
    private final List<BaseFragment> fragments = new ArrayList<>();

    @Inject
    public PagerAdapter(FragmentManager fm, List<String> titles) {
        super(fm);
        this.titles.addAll(titles);
    }

    public void setItems(List<BaseFragment> fragments)
    {
        this.fragments.addAll(fragments);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }
}
