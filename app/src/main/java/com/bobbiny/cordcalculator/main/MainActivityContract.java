package com.bobbiny.cordcalculator.main;

import com.bobbiny.cordcalculator.base.BaseFragment;

public interface MainActivityContract {

    interface View {

        void initViews();

        void setFragment(BaseFragment fragment);
    }

    interface Presenter {

    }
}
