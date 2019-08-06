package com.bobbiny.cordcalculator.main;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;

public class MainActivityPresenter implements MainActivityContract.Presenter {

    private static final String TAG = MainActivityPresenter.class.getSimpleName();

    @NonNull
    private MainActivityContract.View view;

    MainActivityPresenter(@NonNull MainActivityContract.View view, NavController navController) {
        this.view = view;
    }
}
