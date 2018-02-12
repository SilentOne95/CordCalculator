package com.example.android.cordcalculator;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ViewFlipper;

public class MainLayoutActivity extends AppCompatActivity {

    ViewFlipper vf;
    ImageButton previousStep;
    ImageButton nextStep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_layout);

        vf = findViewById(R.id.view_flipper);
        previousStep = findViewById(R.id.button_step_back);
        nextStep = findViewById(R.id.button_step_next);

        previousStep.setVisibility(View.GONE);
    }

    public void openNextStep(View view) {
        vf.showNext();
        previousStep.setVisibility(View.VISIBLE);

        if (vf.getDisplayedChild() == 2)
            nextStep.setVisibility(View.GONE);
    }

    public void openPreviousStep(View view) {
        vf.showPrevious();

        if (vf.getDisplayedChild() == 0)
            previousStep.setVisibility(View.GONE);
        else if (vf.getDisplayedChild() == 1)
            nextStep.setVisibility(View.VISIBLE);
    }

}
