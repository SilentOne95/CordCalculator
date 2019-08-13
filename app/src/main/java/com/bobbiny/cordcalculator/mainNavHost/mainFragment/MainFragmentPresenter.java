package com.bobbiny.cordcalculator.mainNavHost.mainFragment;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;

import com.android.cordcalculator.R;

public class MainFragmentPresenter implements MainFragmentContract.Presenter {

    @NonNull
    private MainFragmentContract.View mView;

    private NavOptions mNavOptionsNextPrevious, mNavOptionsNext;

    MainFragmentPresenter(@NonNull MainFragmentContract.View view) {
        mView = view;

        mNavOptionsNextPrevious = new NavOptions.Builder()
                .setEnterAnim(R.anim.slide_in_right)
                .setExitAnim(R.anim.slide_out_right)
                .setPopEnterAnim(R.anim.slide_in_left)
                .setPopExitAnim(R.anim.slide_out_left)
                .build();

        mNavOptionsNext = new NavOptions.Builder()
                .setEnterAnim(R.anim.slide_in_left)
                .setExitAnim(R.anim.slide_out_left)
                .setPopEnterAnim(R.anim.slide_in_right)
                .setPopExitAnim(R.anim.slide_out_right)
                .build();
    }

    @Override
    public void onClickPreviousStep(View imageButtonPrevious, ImageView imageButtonNext, NavController navController) {
        switch (navController.getCurrentDestination().getId()) {
            case R.id.secondStepFragment:
                navController.navigate(R.id.firstStepFragment, null, mNavOptionsNextPrevious);
                imageButtonPrevious.setVisibility(View.INVISIBLE);
                break;
            case R.id.thirdStepFragment:
                navController.navigate(R.id.secondStepFragment, null, mNavOptionsNextPrevious);
                break;
            case R.id.fourthStepFragment:
                navController.navigate(R.id.thirdStepFragment, null, mNavOptionsNextPrevious);
                imageButtonNext.setVisibility(View.VISIBLE);
                break;
        }
    }

    @Override
    public void onClickNextStep(View imageButtonNext, ImageView imageButtonPrevious, NavController navController) {
        switch (navController.getCurrentDestination().getId()) {
            case R.id.firstStepFragment:
                navController.navigate(R.id.secondStepFragment, null, mNavOptionsNext);
                imageButtonPrevious.setVisibility(View.VISIBLE);
                break;
            case R.id.secondStepFragment:
                navController.navigate(R.id.thirdStepFragment, null, mNavOptionsNext);
                break;
            case R.id.thirdStepFragment:
                navController.navigate(R.id.fourthStepFragment, null, mNavOptionsNext);
                imageButtonNext.setVisibility(View.INVISIBLE);
                break;
        }
    }
}
