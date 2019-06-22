package com.bobbiny.cordcalculator.welcome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.android.cordcalculator.R;
import com.bobbiny.cordcalculator.main.MainActivity;

public class WelcomeScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
    }

    public void startProcess(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
