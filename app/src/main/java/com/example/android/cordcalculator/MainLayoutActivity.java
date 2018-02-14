package com.example.android.cordcalculator;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainLayoutActivity extends AppCompatActivity {

    ViewFlipper vf;
    ImageButton previousStep;
    ImageButton nextStep;
    ImageView stepOneImage;
    ImageView stepTwoImage;
    ImageView stepThreeImage;
    ImageView stepFourImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_layout);

        // Re-usable layouts
        vf = findViewById(R.id.view_flipper);
        previousStep = findViewById(R.id.button_step_back);
        previousStep.setVisibility(View.GONE);
        nextStep = findViewById(R.id.button_step_next);

        // Progress bar images
        stepOneImage = findViewById(R.id.imageStepOne);
        stepOneImage.setImageResource(R.drawable.one_active);
        stepTwoImage = findViewById(R.id.imageStepTwo);
        stepTwoImage.setImageResource(R.drawable.two_inactive);
        stepThreeImage = findViewById(R.id.imageStepThree);
        stepThreeImage.setImageResource(R.drawable.three_inactive);
        stepFourImage = findViewById(R.id.imageStepFour);
        stepFourImage.setImageResource(R.drawable.four_inactive);
    }

    // Methods check if button next / previous should be shown.
    public void openNextStep(View view) {
        vf.showNext();
        previousStep.setVisibility(View.VISIBLE);

        if (vf.getDisplayedChild() == 3)
            nextStep.setVisibility(View.GONE);

        switchStepImage(vf.getDisplayedChild());
    }

    public void openPreviousStep(View view) {
        vf.showPrevious();

        if (vf.getDisplayedChild() == 0)
            previousStep.setVisibility(View.GONE);
        else if (vf.getDisplayedChild() == 2)
            nextStep.setVisibility(View.VISIBLE);

        switchStepImage(vf.getDisplayedChild());
    }

    // Responsible for showing active step in progress bar
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
