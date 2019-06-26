package smartbox.test.application.app.home.adapter.viewholder;

import smartbox.test.application.base.BaseViewHolder;
import smartbox.test.application.data.retrofit.response.EventShop;
import smartbox.test.application.databinding.EventsRecyclerItemBinding;

public class EventsViewHolder extends BaseViewHolder<EventsRecyclerItemBinding, EventShop> {

    public EventsViewHolder(EventsRecyclerItemBinding binding) {
        super(binding);
    }

    @Override
    public void bind(EventShop item) {
            getBinding().setData(item);
    }
}
