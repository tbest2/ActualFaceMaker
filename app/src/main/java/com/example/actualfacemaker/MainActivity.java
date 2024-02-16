package com.example.actualfacemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Canvas;
import android.os.Bundle;

import java.util.Random;


// @author Tramanh Best
//February 15

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int skinColor;
    int eyeColor;
    int hairColor;
    int hairStyle;

    MainActivity(){
        Random gen = new Random();
        skinColor = gen.nextInt(5);
        eyeColor = gen.nextInt(5);
        hairColor = gen.nextInt(10);
        hairStyle = gen.nextInt(3) + 1;
    }

    void onDraw(Canvas c){

    }

    int getSkin(){
        return skinColor;
    }

    int getEye(){
        return eyeColor;
    }

    int getHairC(){
        return hairColor;
    }

    int getHairS(){
        return hairStyle;
    }

}