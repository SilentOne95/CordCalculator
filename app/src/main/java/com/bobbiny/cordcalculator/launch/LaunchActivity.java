package com.bobbiny.cordcalculator.launch;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.bobbiny.cordcalculator.welcome.WelcomeScreenActivity;

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(LaunchActivity.this, WelcomeScreenActivity.class));
        finish();
    }
}
