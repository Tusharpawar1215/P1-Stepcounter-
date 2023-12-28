package com.example.stepcounter.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

import com.example.stepcounter.R;
public class SplashScreen extends FragmentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        runNextScreen();
        askFoeFullScreen();
    }

    private void runNextScreen() {
    }

    private void askFoeFullScreen() {
        
    }
}
