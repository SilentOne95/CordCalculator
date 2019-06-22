package com.bobbiny.cordcalculator.main;

import android.support.annotation.NonNull;

import com.bobbiny.cordcalculator.base.BaseFragmentContract;

public class MainActivityPresenter implements MainActivityContract.Presenter,
        BaseFragmentContract.Presenter {

    private static final String TAG = MainActivityPresenter.class.getSimpleName();

    @NonNull
    private MainActivityContract.View view;

    MainActivityPresenter(@NonNull MainActivityContract.View view) {
        this.view = view;
    }
}
