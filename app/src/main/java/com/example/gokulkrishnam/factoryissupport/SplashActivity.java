package com.example.gokulkrishnam.factoryissupport;

import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;



public class SplashActivity extends AppCompatActivity {

    private  static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Window window = SplashActivity.this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

        // finally change the color
        window.setStatusBarColor(ContextCompat.getColor(SplashActivity.this,R.color.my_statusbar_color));

        TextView logoname_first = findViewById(R.id.logoname_first);
        logoname_first.setText(R.string.logo_firstname);

        Animation lefttoright = AnimationUtils.loadAnimation(SplashActivity.this,android.R.anim.slide_in_left);
        lefttoright.setDuration(3000);
        logoname_first.startAnimation(lefttoright);

        Animation righttoleft = AnimationUtils.loadAnimation(SplashActivity.this,R.anim.move_rtl);
        righttoleft.setDuration(2500);

        TextView logoname_second = findViewById(R.id.logoname_second);
        logoname_second.setText(R.string.logoname_second);
        logoname_second.startAnimation(righttoleft);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
