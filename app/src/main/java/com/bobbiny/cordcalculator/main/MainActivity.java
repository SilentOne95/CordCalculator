package com.bobbiny.cordcalculator.main;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.android.cordcalculator.R;
import com.android.cordcalculator.databinding.ActivityMainBinding;
import com.bobbiny.cordcalculator.utils.Handler;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {

    private MainActivityPresenter mPresenter;
    private ActivityMainBinding mBinding;
    private NavController mNavController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mNavController = Navigation.findNavController(this, R.id.nav_host_fragment);

        mPresenter = new MainActivityPresenter(this, mNavController);

        mBinding.setNavController(mNavController);
        mBinding.setHandler(new Handler());
    }
}
