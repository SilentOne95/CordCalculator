package com.example.android.cordcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;

public class FirstQuestion extends AppCompatActivity implements View.OnClickListener {

    CheckBox firstCheckbox, secondCheckbox, thirdCheckbox, fourthCheckbox, fifthCheckbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_question);

        firstCheckbox = findViewById(R.id.first_step_first_answer);
        firstCheckbox.setOnClickListener(this);
        secondCheckbox = findViewById(R.id.first_step_second_answer);
        secondCheckbox.setOnClickListener(this);
        thirdCheckbox = findViewById(R.id.first_step_third_answer);
        thirdCheckbox.setOnClickListener(this);
        fourthCheckbox = findViewById(R.id.first_step_fourth_answer);
        fourthCheckbox.setOnClickListener(this);
        fifthCheckbox = findViewById(R.id.first_step_fifth_answer);
        fifthCheckbox.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}
