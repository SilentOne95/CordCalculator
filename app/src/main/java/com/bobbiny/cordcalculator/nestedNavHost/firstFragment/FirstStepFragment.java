package com.bobbiny.cordcalculator.nestedNavHost.firstFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.android.cordcalculator.R;
import com.android.cordcalculator.databinding.FragmentFirstStepBinding;

public class FirstStepFragment extends Fragment implements FirstStepContract.View {

    private FirstStepPresenter mPresenter;
    private FragmentFirstStepBinding mBinding;

    public FirstStepFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_first_step, container, false);
        return mBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mPresenter = new FirstStepPresenter(this);
        mBinding.setPresenter(mPresenter);
    }
}
