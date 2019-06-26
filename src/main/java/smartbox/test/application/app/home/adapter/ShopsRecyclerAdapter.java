package smartbox.test.application.app.home.adapter;

import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import javax.inject.Inject;

import smartbox.test.application.R;
import smartbox.test.application.app.home.adapter.viewholder.ShopsViewHolder;
import smartbox.test.application.base.BaseRecyclerAdapter;
import smartbox.test.application.data.retrofit.response.EventShop;
import smartbox.test.application.databinding.ShopsRecyclerItemBinding;

public class ShopsRecyclerAdapter extends BaseRecyclerAdapter<ShopsRecyclerItemBinding, EventShop, ShopsViewHolder> {


    public ShopsRecyclerAdapter.UserItemListListener userItemListListener;

    @Inject
    public ShopsRecyclerAdapter(ShopsRecyclerAdapter.UserItemListListener listener) {
        this.userItemListListener = listener;
    }

    @Override
    protected ShopsRecyclerItemBinding getBinding(LayoutInflater inflater, ViewGroup parent) {
        return DataBindingUtil.inflate(inflater, R.layout.shops_recycler_item, parent, false);
    }

    @Override
    protected ShopsViewHolder getViewHolder(ShopsRecyclerItemBinding binding) {
        binding.setAdapter(this);
        return new ShopsViewHolder(binding);
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    public interface UserItemListListener {
        void onUserItemClick(EventShop user);
    }
}