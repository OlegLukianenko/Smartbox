package smartbox.test.application.app.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import javax.inject.Inject;

import smartbox.test.application.R;
import smartbox.test.application.base.BaseFragment;
import smartbox.test.application.data.retrofit.response.EventShop;
import smartbox.test.application.databinding.FragmentInformationBinding;
import smartbox.test.application.di.viewmodel.Injectable;
import smartbox.test.application.utils.NetworkHelper;
import smartbox.test.application.viewmodel.InformationFragmentViewModel;

public class InformationFragment extends BaseFragment<FragmentInformationBinding> implements Injectable {

    @Inject
    InformationFragmentViewModel viewModel;

    @Inject
    protected NetworkHelper networkHelper;

    public static final int TIMEOUT_CODE = 408;

    @Override
    protected int getLayout() {
        return R.layout.fragment_information;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);
        binding.setHandler(this);

        Bundle bundle = this.getArguments();
        if (bundle != null) {
            EventShop product = bundle.getParcelable("product");
            viewModel.getProfileFromApi().postValue(product);
        }

    }

    public void clickBackButton() {
        getActivity().onBackPressed();
    }

    public void openMap(String latitude, String longitude) {
        if (getActivity() != null) {
            MapFragment mapFragment = new MapFragment();
            Bundle bundle = new Bundle();
            bundle.putDouble("latitude", Double.parseDouble(latitude));
            bundle.putDouble("longitude", Double.parseDouble(longitude));
            mapFragment.setArguments(bundle);
            ((MainActivity) getActivity()).showFragment(mapFragment);
        }
    }


}
