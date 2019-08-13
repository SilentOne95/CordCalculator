package com.bobbiny.cordcalculator.mainNavHost.mainFragment;

import android.widget.ImageView;

import androidx.navigation.NavController;

public interface MainFragmentContract {

    interface View {

    }

    interface Presenter {

        void onClickPreviousStep(android.view.View imageButtonPrevious, ImageView imageButtonNext, NavController navController);

        void onClickNextStep(android.view.View imageButtonNext, ImageView imageButtonPrevious, NavController navController);
    }
}
