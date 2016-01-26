package com.example.aida.animation;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Go(View view) {
        ImageView sky=(ImageView) findViewById(R.id.sky);
        Animation SkyColor=AnimationUtils.loadAnimation(this,R.anim.sky);
        sky.startAnimation(SkyColor);
        ImageView grass=(ImageView) findViewById(R.id.grass);
        Animation GrassColor=AnimationUtils.loadAnimation(this,R.anim.grass);
        grass.startAnimation(GrassColor);

        ImageView Sun = (ImageView)findViewById(R.id.sun);
        Animation SunRise = AnimationUtils.loadAnimation(this,R.anim.sun_rise);
        Sun.startAnimation(SunRise);


        ImageView Clock = (ImageView)findViewById(R.id.clock);
        Animation ClockTurn = AnimationUtils.loadAnimation(this,R.anim.clock_turn);
        Clock.startAnimation(ClockTurn);


        ImageView Hour = (ImageView)findViewById(R.id.hour);
        Animation HourHand = AnimationUtils.loadAnimation(this,R.anim.hour_hand);
        Hour.startAnimation(HourHand);
    }
}
