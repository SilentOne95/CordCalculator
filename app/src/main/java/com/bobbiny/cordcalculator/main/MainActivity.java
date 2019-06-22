package com.bobbiny.cordcalculator.main;

import android.os.Bundle;
import android.widget.ImageView;

import com.android.cordcalculator.R;
import com.bobbiny.cordcalculator.base.BaseActivity;
import com.bobbiny.cordcalculator.base.BaseFragment;

public class MainActivity extends BaseActivity implements MainActivityContract.View{

    private MainActivityPresenter presenter;

    ImageView stepOneImage, stepTwoImage, stepThreeImage, stepFourImage;

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initViews();

        presenter = new MainActivityPresenter(this);
    }

    @Override
    public void initViews() {
        stepOneImage = findViewById(R.id.image_step_one);
        stepOneImage.setImageResource(R.drawable.one_active);
        stepTwoImage = findViewById(R.id.image_step_two);
        stepTwoImage.setImageResource(R.drawable.two_inactive);
        stepThreeImage = findViewById(R.id.image_step_three);
        stepThreeImage.setImageResource(R.drawable.three_inactive);
        stepFourImage = findViewById(R.id.image_step_four);
        stepFourImage.setImageResource(R.drawable.four_inactive);
    }

    @Override
    public void setFragment(BaseFragment fragment) {
        fragment.attachPresenter(presenter);

    }

    // Method that is responsible for showing active step in progress bar
    public void switchStepImage(int numberOfStep) {
        switch (numberOfStep) {
            case 0:
                stepOneImage.setImageResource(R.drawable.one_active);
                stepTwoImage.setImageResource(R.drawable.two_inactive);
                stepThreeImage.setImageResource(R.drawable.three_inactive);
                stepFourImage.setImageResource(R.drawable.four_inactive);
                break;
            case 1:
                stepOneImage.setImageResource(R.drawable.one_inactive);
                stepTwoImage.setImageResource(R.drawable.two_active);
                stepThreeImage.setImageResource(R.drawable.three_inactive);
                stepFourImage.setImageResource(R.drawable.four_inactive);
                break;
            case 2:
                stepOneImage.setImageResource(R.drawable.one_inactive);
                stepTwoImage.setImageResource(R.drawable.two_inactive);
                stepThreeImage.setImageResource(R.drawable.three_active);
                stepFourImage.setImageResource(R.drawable.four_inactive);
                break;
            case 3:
                stepOneImage.setImageResource(R.drawable.one_inactive);
                stepTwoImage.setImageResource(R.drawable.two_inactive);
                stepThreeImage.setImageResource(R.drawable.three_inactive);
                stepFourImage.setImageResource(R.drawable.four_active);
                break;
        }
    }
}
