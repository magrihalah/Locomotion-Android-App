package com.example.locomotion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class IntroActivity extends AppCompatActivity {

    ImageView logo, splashImg;
    LottieAnimationView LottieAnimationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        logo = findViewById(R.id.intro_logo);
        splashImg = findViewById(R.id.intro_background);
        LottieAnimationView = findViewById(R.id.intro_lottie);

        splashImg.animate().translationY(-1600).setDuration(1000).setStartDelay(4000);
        logo.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
        LottieAnimationView.animate().translationY(1400).setDuration(1000).setStartDelay(4000);

    }

}