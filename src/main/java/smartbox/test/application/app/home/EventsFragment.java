package smartbox.test.application.app.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import smartbox.test.application.R;
import smartbox.test.application.app.home.adapter.EventsRecyclerAdapter;
import smartbox.test.application.base.BaseFragment;
import smartbox.test.application.data.retrofit.response.EventShop;
import smartbox.test.application.databinding.FragmentEventsBinding;
import smartbox.test.application.di.viewmodel.Injectable;
import smartbox.test.application.utils.NetworkHelper;
import smartbox.test.application.viewmodel.EventsFragmentViewModel;

import static smartbox.test.application.app.home.InformationFragment.TIMEOUT_CODE;

public class EventsFragment extends BaseFragment<FragmentEventsBinding> implements
        Injectable, EventsRecyclerAdapter.UserItemListListener {

    @Inject
    EventsFragmentViewModel viewModel;

    @Inject
    protected NetworkHelper networkHelper;

    @Inject
    EventsRecyclerAdapter userRecyclerAdapter;

    @Override
    protected int getLayout() {
        return R.layout.fragment_events;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.setViewModel(viewModel);
        binding.setHandler(this);
        binding.setLifecycleOwner(this);

        viewModel.sendRequest();

        viewModel.getProgressBarEvent().postValue(true);
        initSubscribers();
        initUserAdapter();
    }

    private void initUserAdapter() {
        binding.recycleView.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.recycleView.setAdapter(userRecyclerAdapter);
    }

    private void initSubscribers() {


        viewModel.getEventShopMutableLiveData().observe(this, eventShopListResponseWrap ->
        {
            List<EventShop> event = new ArrayList<>();
            if (eventShopListResponseWrap.status) {
                for (EventShop ev : eventShopListResponseWrap.data) {
                    if (ev.type.equals("event")) {
                        event.add(ev);
                    }
                }
                userRecyclerAdapter.setItems(event);
                viewModel.getProgressBarEvent().postValue(false);
            } else {
                if (eventShopListResponseWrap.statusCode == TIMEOUT_CODE) {
                    if (networkHelper.isNetworkAvailable()) {
                        showToast(getString(R.string.poor_internet_connection), Toast.LENGTH_LONG);
                    }
                } else {
                    showToast(eventShopListResponseWrap.message, Toast.LENGTH_LONG);
                }
            }
        });
    }

    @Override
    public void onUserItemClick(EventShop event) {
        if (getActivity() != null) {
            InformationFragment descriptionFragment = new InformationFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("product", event);
            descriptionFragment.setArguments(bundle);
            ((MainActivity) getActivity()).showFragment(descriptionFragment);
        }
    }
}
