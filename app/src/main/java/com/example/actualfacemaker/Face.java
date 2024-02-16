package com.example.actualfacemaker;

import android.graphics.Canvas;

import java.util.Random;


// @author Tramanh Best
//February 15


public class Face {
    int skinColor;
    int eyeColor;
    int hairColor;
    int hairStyle;

    Random gen = new Random();
    Face(){
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



