package com.bobbiny.cordcalculator.base;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class BaseFragment extends Fragment implements BaseFragmentContract.View{

    protected BaseFragmentContract.Presenter navigationPresenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(getLayout(), container, false);
    }

    protected abstract int getLayout();

    @Override
    public void attachPresenter(BaseFragmentContract.Presenter presenter) {
        navigationPresenter = presenter;
    }
}
