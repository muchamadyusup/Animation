package com.e.animation;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class SplashActivity extends AppCompatActivity {
    AnimationDrawable animationDrawable;
    ConstraintLayout SPLASHSCREEN;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        SPLASHSCREEN = (ConstraintLayout) findViewById(R.id.layout);

        animationDrawable = (AnimationDrawable)SPLASHSCREEN.getBackground();
        animationDrawable.setEnterFadeDuration(5000);
        animationDrawable.setExitFadeDuration(5000);

        animationDrawable.start();
    }
}
