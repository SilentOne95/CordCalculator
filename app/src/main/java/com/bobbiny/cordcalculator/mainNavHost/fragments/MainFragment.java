package com.bobbiny.cordcalculator.mainNavHost.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.cordcalculator.R;
import com.android.cordcalculator.databinding.FragmentMainBinding;
import com.bobbiny.cordcalculator.utils.Handler;

public class MainFragment extends Fragment {

    private FragmentMainBinding mBinding;
    private NavController mNavController;

    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false);
        mNavController = Navigation.findNavController(mBinding.getRoot().findViewById(R.id.nav_host_nested_fragment));
        return mBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mBinding.setNavController(mNavController);
        mBinding.setHandler(new Handler());
    }
}
