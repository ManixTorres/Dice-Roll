package com.blacksunrisen.myapplication;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.Random;

public class HW1 extends AppCompatActivity {

    ImageView dicce, dicce2, dicce3, dicce4, dicce5;
    Random rand = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h_w1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        dicce = findViewById(R.id.dice);
        dicce2 = findViewById(R.id.diceB);
        dicce3 = findViewById(R.id.diceC);
        dicce4 = findViewById(R.id.diceD);
        dicce5 = findViewById(R.id.diceE);

        dicce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                diceanim();
            }
        });

        dicce2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                diceanim();
            }
        });

        dicce3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                diceanim();
            }
        });

        dicce4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                diceanim();
            }
        });

        dicce5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                diceanim();
            }
        });

    }

    private void diceanim(){
        int i = rand.nextInt(6)+1;
        int j = rand.nextInt(6)+1;
        int k = rand.nextInt(6)+1;
        int l = rand.nextInt(6)+1;
        int m = rand.nextInt(6)+1;


        Animation move = AnimationUtils.loadAnimation(this, R.anim.rotate);
        dicce.startAnimation(move);
        dicce2.startAnimation(move);
        dicce3.startAnimation(move);
        dicce4.startAnimation(move);
        dicce5.startAnimation(move);



        switch(i){
            case 1:
                dicce.setImageResource(R.drawable.dice1);
                break;
            case 2:
                dicce.setImageResource(R.drawable.dice2);
                break;
            case 3:
                dicce.setImageResource(R.drawable.dice3);
                break;
            case 4:
                dicce.setImageResource(R.drawable.dice4);
                break;
            case 5:
                dicce.setImageResource(R.drawable.dice5);
                break;
            case 6:
                dicce.setImageResource(R.drawable.dice6);
                break;
        }
        switch(j){
            case 1:
                dicce2.setImageResource(R.drawable.dice1);
                break;
            case 2:
                dicce2.setImageResource(R.drawable.dice2);
                break;
            case 3:
                dicce2.setImageResource(R.drawable.dice3);
                break;
            case 4:
                dicce2.setImageResource(R.drawable.dice4);
                break;
            case 5:
                dicce2.setImageResource(R.drawable.dice5);
                break;
            case 6:
                dicce2.setImageResource(R.drawable.dice6);
                break;
        }
        switch(k){
            case 1:
                dicce3.setImageResource(R.drawable.dice1);
                break;
            case 2:
                dicce3.setImageResource(R.drawable.dice2);
                break;
            case 3:
                dicce3.setImageResource(R.drawable.dice3);
                break;
            case 4:
                dicce3.setImageResource(R.drawable.dice4);
                break;
            case 5:
                dicce3.setImageResource(R.drawable.dice5);
                break;
            case 6:
                dicce3.setImageResource(R.drawable.dice6);
                break;
        }
        switch(l){
            case 1:
                dicce4.setImageResource(R.drawable.dice1);
                break;
            case 2:
                dicce4.setImageResource(R.drawable.dice2);
                break;
            case 3:
                dicce4.setImageResource(R.drawable.dice3);
                break;
            case 4:
                dicce4.setImageResource(R.drawable.dice4);
                break;
            case 5:
                dicce4.setImageResource(R.drawable.dice5);
                break;
            case 6:
                dicce4.setImageResource(R.drawable.dice6);
                break;
        }
        switch(m){
            case 1:
                dicce5.setImageResource(R.drawable.dice1);
                break;
            case 2:
                dicce5.setImageResource(R.drawable.dice2);
                break;
            case 3:
                dicce5.setImageResource(R.drawable.dice3);
                break;
            case 4:
                dicce5.setImageResource(R.drawable.dice4);
                break;
            case 5:
                dicce5.setImageResource(R.drawable.dice5);
                break;
            case 6:
                dicce5.setImageResource(R.drawable.dice6);
                break;
        }
    }
}