package com.bobbiny.cordcalculator.main;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.android.cordcalculator.R;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {

    private MainActivityPresenter presenter;

    ImageView stepOneImage, stepTwoImage, stepThreeImage, stepFourImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        presenter = new MainActivityPresenter(this);
    }

    @Override
    public void initViews() {
        stepOneImage = findViewById(R.id.image_step_one);
        stepTwoImage = findViewById(R.id.image_step_two);
        stepThreeImage = findViewById(R.id.image_step_three);
        stepFourImage = findViewById(R.id.image_step_four);
    }
}
