package smartbox.test.application.app.home.adapter;

import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import javax.inject.Inject;

import smartbox.test.application.R;
import smartbox.test.application.app.home.adapter.viewholder.EventsViewHolder;
import smartbox.test.application.base.BaseRecyclerAdapter;
import smartbox.test.application.data.retrofit.response.EventShop;
import smartbox.test.application.databinding.EventsRecyclerItemBinding;

public class EventsRecyclerAdapter extends BaseRecyclerAdapter<EventsRecyclerItemBinding, EventShop, EventsViewHolder> {


    public UserItemListListener userItemListListener;

    @Inject
    public EventsRecyclerAdapter(UserItemListListener listener) {
        this.userItemListListener = listener;
    }

    @Override
    protected EventsRecyclerItemBinding getBinding(LayoutInflater inflater, ViewGroup parent) {
        return DataBindingUtil.inflate(inflater, R.layout.events_recycler_item, parent, false);
    }

    @Override
    protected EventsViewHolder getViewHolder(EventsRecyclerItemBinding binding) {
        binding.setAdapter(this);
        return new EventsViewHolder(binding);
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    public interface UserItemListListener {
        void onUserItemClick(EventShop user);
    }
}