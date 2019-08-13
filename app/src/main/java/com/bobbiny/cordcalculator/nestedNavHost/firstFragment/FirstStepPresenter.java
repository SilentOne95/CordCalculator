package com.bobbiny.cordcalculator.nestedNavHost.firstFragment;

import android.view.View;
import android.widget.CheckBox;

import androidx.annotation.NonNull;

public class FirstStepPresenter implements FirstStepContract.Presenter {

    @NonNull
    private FirstStepContract.View mView;

    private int mNumOfSelectedCheckBoxes;

    FirstStepPresenter(@NonNull FirstStepContract.View view) {
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
