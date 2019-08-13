package com.bobbiny.cordcalculator.nestedNavHost.secondFragment;

import android.view.View;
import android.widget.CheckBox;

import androidx.annotation.NonNull;

public class SecondStepPresenter implements SecondStepContract.Presenter {

    @NonNull
    private SecondStepContract.View mView;

    private int mNumOfSelectedCheckBoxes;

    SecondStepPresenter(@NonNull SecondStepContract.View view) {
        mView = view;
        mNumOfSelectedCheckBoxes = 0;
    }

    @Override
    public void onCheckboxClickHandler(View checkBox) {
        if (((CheckBox) checkBox).isChecked()) {
            if (mNumOfSelectedCheckBoxes == 1) {
                ((CheckBox) checkBox).setChecked(false);
            } else {
                mNumOfSelectedCheckBoxes++;
            }
        } else {
            mNumOfSelectedCheckBoxes--;
        }
    }
}
