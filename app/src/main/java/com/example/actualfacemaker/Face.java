package com.example.actualfacemaker;

import android.graphics.Canvas;
import android.graphics.Paint;

import java.util.Random;


// @author Tramanh Best
//February 15


public class Face {




    int skinColor;
    int eyeColor;
    int hairColor;
    int hairStyle;
    int redNow;
    int blueNow;
    int greenNow;

    Random gen = new Random();
    Face(){
        int skinColorRed = gen.nextInt(255);
        int skinColorBlue = gen.nextInt(255);
        int skinColorGreen = gen.nextInt(255);

        int eyeColorRed = gen.nextInt(255);
        int eyeColorBlue = gen.nextInt(255);
        int eyeColorGreen = gen.nextInt(255);

        int hairColorRed = gen.nextInt(255);
        int hairColorBlue = gen.nextInt(255);
        int hairColorGreen = gen.nextInt(255);

        int hairStyle = gen.nextInt(3) + 1;
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



