package com.example.android.cordcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartingScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting_screen);
    }

    public void openFirstStep(View view) {
        Intent i = new Intent(this, MainLayoutActivity.class);
        startActivity(i);
    }
}