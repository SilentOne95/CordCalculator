package com.bobbiny.cordcalculator.questionFragments.first;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.android.cordcalculator.R;
import com.bobbiny.cordcalculator.base.BaseFragment;

public class FirstQuestionFragment extends BaseFragment {

    public FirstQuestionFragment() {
        // Required empty public constructor
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_first_question;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
