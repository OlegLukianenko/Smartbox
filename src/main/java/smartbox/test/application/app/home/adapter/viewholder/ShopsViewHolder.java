package smartbox.test.application.app.home.adapter.viewholder;

import smartbox.test.application.base.BaseViewHolder;
import smartbox.test.application.data.retrofit.response.EventShop;
import smartbox.test.application.databinding.ShopsRecyclerItemBinding;

public class ShopsViewHolder extends BaseViewHolder<ShopsRecyclerItemBinding, EventShop> {

    public ShopsViewHolder(ShopsRecyclerItemBinding binding) {
        super(binding);
    }

    @Override
    public void bind(EventShop item) {
        getBinding().setData(item);
    }
}

