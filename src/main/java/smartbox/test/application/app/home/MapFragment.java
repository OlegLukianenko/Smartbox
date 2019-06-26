package smartbox.test.application.app.home;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import javax.inject.Inject;

import smartbox.test.application.R;
import smartbox.test.application.base.BaseFragment;
import smartbox.test.application.databinding.FragmentMapBinding;
import smartbox.test.application.di.viewmodel.Injectable;

public class MapFragment extends BaseFragment<FragmentMapBinding> implements
        Injectable, OnMapReadyCallback {

    @Inject
    protected SharedPreferences sharedPreferences;

    private double latitude;
    private double longitude;

    @Override
    protected int getLayout() {
        return R.layout.fragment_map;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.setLifecycleOwner(this);
        binding.setHandler(this);

        Bundle bundle = this.getArguments();
        latitude = bundle.getDouble("latitude");
        longitude  = bundle.getDouble("longitude");
        SupportMapFragment mapFragment = (SupportMapFragment) this.getChildFragmentManager()
                .findFragmentById(R.id.mapFragment);
        assert mapFragment != null;
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap map) {
        map.addMarker(new MarkerOptions()
                .position(new LatLng(latitude, longitude))
                .title("Marker"));

        map.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(latitude, longitude)));
        map.animateCamera(CameraUpdateFactory.zoomTo((float) 4.6));
    }

    public void clickBackButton() {
        getActivity().onBackPressed();
    }

}
