package smartbox.test.application.databinding;
import smartbox.test.application.R;
import smartbox.test.application.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class EventsRecyclerItemBindingImpl extends EventsRecyclerItemBinding implements smartbox.test.application.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.wrapContainer, 4);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public EventsRecyclerItemBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private EventsRecyclerItemBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.support.constraint.ConstraintLayout) bindings[4]
            );
        this.image.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.shortDescription.setTag(null);
        this.title.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new smartbox.test.application.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.adapter == variableId) {
            setAdapter((smartbox.test.application.app.home.adapter.EventsRecyclerAdapter) variable);
        }
        else if (BR.data == variableId) {
            setData((smartbox.test.application.data.retrofit.response.EventShop) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAdapter(@Nullable smartbox.test.application.app.home.adapter.EventsRecyclerAdapter Adapter) {
        this.mAdapter = Adapter;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.adapter);
        super.requestRebind();
    }
    public void setData(@Nullable smartbox.test.application.data.retrofit.response.EventShop Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String dataSmallImage = null;
        java.lang.String dataTitle = null;
        smartbox.test.application.app.home.adapter.EventsRecyclerAdapter adapter = mAdapter;
        java.lang.String dataShortDescription = null;
        smartbox.test.application.data.retrofit.response.EventShop data = mData;

        if ((dirtyFlags & 0x6L) != 0) {



                if (data != null) {
                    // read data.smallImage
                    dataSmallImage = data.smallImage;
                    // read data.title
                    dataTitle = data.title;
                    // read data.shortDescription
                    dataShortDescription = data.shortDescription;
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            smartbox.test.application.utils.BindingAdapters.setAvatar(this.image, dataSmallImage);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.shortDescription, dataShortDescription);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.title, dataTitle);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback3);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // adapter.userItemListListener != null
        boolean adapterUserItemListListenerJavaLangObjectNull = false;
        // adapter
        smartbox.test.application.app.home.adapter.EventsRecyclerAdapter adapter = mAdapter;
        // data
        smartbox.test.application.data.retrofit.response.EventShop data = mData;
        // adapter != null
        boolean adapterJavaLangObjectNull = false;
        // adapter.userItemListListener
        smartbox.test.application.app.home.adapter.EventsRecyclerAdapter.UserItemListListener adapterUserItemListListener = null;



        adapterJavaLangObjectNull = (adapter) != (null);
        if (adapterJavaLangObjectNull) {


            adapterUserItemListListener = adapter.userItemListListener;

            adapterUserItemListListenerJavaLangObjectNull = (adapterUserItemListListener) != (null);
            if (adapterUserItemListListenerJavaLangObjectNull) {



                adapterUserItemListListener.onUserItemClick(data);
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): adapter
        flag 1 (0x2L): data
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}