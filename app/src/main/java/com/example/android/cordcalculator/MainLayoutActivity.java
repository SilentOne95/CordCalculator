package com.example.android.cordcalculator;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainLayoutActivity extends AppCompatActivity {

    ViewFlipper vf;
    ImageButton moveBackButton;
    ImageButton moveNextButton;
    ImageView stepOneImage;
    ImageView stepTwoImage;
    ImageView stepThreeImage;
    ImageView stepFourImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_layout);

        // Re-usable layouts
        vf = findViewById(R.id.viewFlipper);
        moveBackButton = findViewById(R.id.image_arrow_left);
        moveBackButton.setVisibility(View.GONE);
        moveNextButton = findViewById(R.id.image_arrow_right);

        // Progress bar images
        stepOneImage = findViewById(R.id.image_step_one);
        stepOneImage.setImageResource(R.drawable.one_active);
        stepTwoImage = findViewById(R.id.image_step_two);
        stepTwoImage.setImageResource(R.drawable.two_inactive);
        stepThreeImage = findViewById(R.id.image_step_three);
        stepThreeImage.setImageResource(R.drawable.three_inactive);
        stepFourImage = findViewById(R.id.image_step_four);
        stepFourImage.setImageResource(R.drawable.four_inactive);
    }

    // Checks if button next / previous is redundant
    public void moveNext(View view) {
        vf.showNext();
        moveBackButton.setVisibility(View.VISIBLE);

        if (vf.getDisplayedChild() == 3)
            moveNextButton.setVisibility(View.GONE);

        switchStepImage(vf.getDisplayedChild());
    }

    public void moveBack(View view) {
        vf.showPrevious();

        if (vf.getDisplayedChild() == 0)
            moveBackButton.setVisibility(View.GONE);
        else if (vf.getDisplayedChild() == 2)
            moveNextButton.setVisibility(View.VISIBLE);

        switchStepImage(vf.getDisplayedChild());
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
