package com.example.wearecoders.the_four_twenty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {
    private ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        logo=(ImageView)findViewById(R.id.logo);
        Animation anim= AnimationUtils.loadAnimation(this,R.anim.mytransition);
        logo.startAnimation(anim);
        final Intent intent=new Intent(this,MainActivity.class);
        Thread timer=new Thread() {
            public void run() {
                try {
                    sleep(5000);
                }
                catch (InterruptedException e){
                e.printStackTrace();
                }
            finally
            {
                startActivity(intent);
                finish();
            }
        }
        };
        timer.start();
    }
}
