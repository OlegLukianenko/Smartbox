package smartbox.test.application.databinding;
import smartbox.test.application.R;
import smartbox.test.application.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentInformationBindingImpl extends FragmentInformationBinding implements smartbox.test.application.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.headerBackground, 8);
        sViewsWithIds.put(R.id.headerResizer, 9);
        sViewsWithIds.put(R.id.scrollView2, 10);
        sViewsWithIds.put(R.id.scrollContainer, 11);
        sViewsWithIds.put(R.id.textButton, 12);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentInformationBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private FragmentInformationBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[1]
            , (android.view.View) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.support.constraint.ConstraintLayout) bindings[8]
            , (android.view.View) bindings[9]
            , (android.widget.ImageView) bindings[3]
            , (android.support.constraint.ConstraintLayout) bindings[11]
            , (android.widget.ScrollView) bindings[10]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            );
        this.backArrow.setTag(null);
        this.buttonLocation.setTag(null);
        this.description.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.profileImage.setTag(null);
        this.shortDescription.setTag(null);
        this.textPricing.setTag(null);
        this.title.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new smartbox.test.application.generated.callback.OnClickListener(this, 2);
        mCallback1 = new smartbox.test.application.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.data == variableId) {
            setData((smartbox.test.application.data.retrofit.response.EventShop) variable);
        }
        else if (BR.handler == variableId) {
            setHandler((smartbox.test.application.app.home.InformationFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((smartbox.test.application.viewmodel.InformationFragmentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable smartbox.test.application.data.retrofit.response.EventShop Data) {
        this.mData = Data;
    }
    public void setHandler(@Nullable smartbox.test.application.app.home.InformationFragment Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setViewModel(@Nullable smartbox.test.application.viewmodel.InformationFragmentViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelGetProfileFromApi((android.arch.lifecycle.MutableLiveData<smartbox.test.application.data.retrofit.response.EventShop>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelGetProfileFromApi(android.arch.lifecycle.MutableLiveData<smartbox.test.application.data.retrofit.response.EventShop> ViewModelGetProfileFromApi, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        java.lang.String viewModelGetProfileFromApiGetValueTitle = null;
        java.lang.String viewModelGetProfileFromApiGetValueType = null;
        smartbox.test.application.data.retrofit.response.EventShop viewModelGetProfileFromApiGetValue = null;
        java.lang.String viewModelGetProfileFromApiGetValueDescription = null;
        smartbox.test.application.app.home.InformationFragment handler = mHandler;
        android.arch.lifecycle.MutableLiveData<smartbox.test.application.data.retrofit.response.EventShop> viewModelGetProfileFromApi = null;
        java.lang.String viewModelGetProfileFromApiGetValueBigImage = null;
        java.lang.String viewModelGetProfileFromApiGetValueShortDescription = null;
        smartbox.test.application.viewmodel.InformationFragmentViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x19L) != 0) {



                if (viewModel != null) {
                    // read viewModel.getProfileFromApi()
                    viewModelGetProfileFromApi = viewModel.getProfileFromApi();
                }
                updateLiveDataRegistration(0, viewModelGetProfileFromApi);


                if (viewModelGetProfileFromApi != null) {
                    // read viewModel.getProfileFromApi().getValue()
                    viewModelGetProfileFromApiGetValue = viewModelGetProfileFromApi.getValue();
                }


                if (viewModelGetProfileFromApiGetValue != null) {
                    // read viewModel.getProfileFromApi().getValue().title
                    viewModelGetProfileFromApiGetValueTitle = viewModelGetProfileFromApiGetValue.title;
                    // read viewModel.getProfileFromApi().getValue().type
                    viewModelGetProfileFromApiGetValueType = viewModelGetProfileFromApiGetValue.type;
                    // read viewModel.getProfileFromApi().getValue().description
                    viewModelGetProfileFromApiGetValueDescription = viewModelGetProfileFromApiGetValue.description;
                    // read viewModel.getProfileFromApi().getValue().bigImage
                    viewModelGetProfileFromApiGetValueBigImage = viewModelGetProfileFromApiGetValue.bigImage;
                    // read viewModel.getProfileFromApi().getValue().shortDescription
                    viewModelGetProfileFromApiGetValueShortDescription = viewModelGetProfileFromApiGetValue.shortDescription;
                }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.backArrow.setOnClickListener(mCallback1);
            this.buttonLocation.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.description, viewModelGetProfileFromApiGetValueDescription);
            smartbox.test.application.utils.BindingAdapters.setIcon(this.profileImage, viewModelGetProfileFromApiGetValueBigImage);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.shortDescription, viewModelGetProfileFromApiGetValueShortDescription);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.textPricing, viewModelGetProfileFromApiGetValueType);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.title, viewModelGetProfileFromApiGetValueTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // handler
                smartbox.test.application.app.home.InformationFragment handler = mHandler;
                // viewModel.getProfileFromApi() != null
                boolean viewModelGetProfileFromApiJavaLangObjectNull = false;
                // viewModel.getProfileFromApi().getValue().latitude
                java.lang.String viewModelGetProfileFromApiGetValueLatitude = null;
                // handler != null
                boolean handlerJavaLangObjectNull = false;
                // viewModel.getProfileFromApi()
                android.arch.lifecycle.MutableLiveData<smartbox.test.application.data.retrofit.response.EventShop> viewModelGetProfileFromApi = null;
                // viewModel
                smartbox.test.application.viewmodel.InformationFragmentViewModel viewModel = mViewModel;
                // viewModel.getProfileFromApi().getValue().longitude
                java.lang.String viewModelGetProfileFromApiGetValueLongitude = null;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;
                // viewModel.getProfileFromApi().getValue() != null
                boolean viewModelGetProfileFromApiGetValueJavaLangObjectNull = false;
                // viewModel.getProfileFromApi().getValue()
                smartbox.test.application.data.retrofit.response.EventShop viewModelGetProfileFromApiGetValue = null;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {



                    viewModelJavaLangObjectNull = (viewModel) != (null);
                    if (viewModelJavaLangObjectNull) {


                        viewModelGetProfileFromApi = viewModel.getProfileFromApi();

                        viewModelGetProfileFromApiJavaLangObjectNull = (viewModelGetProfileFromApi) != (null);
                        if (viewModelGetProfileFromApiJavaLangObjectNull) {


                            viewModelGetProfileFromApiGetValue = viewModelGetProfileFromApi.getValue();

                            viewModelGetProfileFromApiGetValueJavaLangObjectNull = (viewModelGetProfileFromApiGetValue) != (null);
                            if (viewModelGetProfileFromApiGetValueJavaLangObjectNull) {


                                viewModelGetProfileFromApiGetValueLatitude = viewModelGetProfileFromApiGetValue.latitude;







                                viewModelGetProfileFromApiGetValueLongitude = viewModelGetProfileFromApiGetValue.longitude;

                                handler.openMap(viewModelGetProfileFromApiGetValueLatitude, viewModelGetProfileFromApiGetValueLongitude);
                            }
                        }
                    }
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // handler
                smartbox.test.application.app.home.InformationFragment handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.clickBackButton();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.getProfileFromApi()
        flag 1 (0x2L): data
        flag 2 (0x3L): handler
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}