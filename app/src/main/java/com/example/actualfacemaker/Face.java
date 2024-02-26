package com.example.actualfacemaker;

import android.graphics.Canvas;
import android.graphics.Paint;

import java.util.Random;


// @author Tramanh Best
//February 15


public class Face {




    int skinColorRed;
    int skinColorBlue;
    int skinColorGreen;

    int eyeColorRed;
    int eyeColorBlue;
    int eyeColorGreen;

    int hairColorRed;
    int hairColorBlue;
    int hairColorGreen;

    int hairStyle;
    int redNow;
    int blueNow;
    int greenNow;

    Random gen = new Random();
    Face(){
        skinColorRed = gen.nextInt(255);
        skinColorBlue = gen.nextInt(255);
        skinColorGreen = gen.nextInt(255);

        eyeColorRed = gen.nextInt(255);
        eyeColorBlue = gen.nextInt(255);
        eyeColorGreen = gen.nextInt(255);

        hairColorRed = gen.nextInt(255);
        hairColorBlue = gen.nextInt(255);
       hairColorGreen = gen.nextInt(255);

        hairStyle = gen.nextInt(3) + 1;
    }

    void randomizer(){

            skinColorRed = gen.nextInt(255);
           skinColorBlue = gen.nextInt(255);
           skinColorGreen = gen.nextInt(255);

           eyeColorRed = gen.nextInt(255);
           eyeColorBlue = gen.nextInt(255);
           eyeColorGreen = gen.nextInt(255);

            hairColorRed = gen.nextInt(255);
            hairColorBlue = gen.nextInt(255);
            hairColorGreen = gen.nextInt(255);

            hairStyle = gen.nextInt(3) + 1;

    }

    //m is mode from face controller to indicate hair, eyes, or skin
    int getRed(int m){
        if (m == 1){
            return hairColorRed;
        } else if (m == 2){
            return eyeColorRed;
        } else
            return skinColorRed;
        }
    int getBlue(int m){
        if (m == 1){
            return hairColorBlue;
        } else if (m == 2){
            return eyeColorBlue;
        } else
            return skinColorBlue;
    }

    int getGreen(int m) {
        if (m == 1) {
            return hairColorGreen;
        } else if (m == 2) {
            return eyeColorGreen;
        } else
            return skinColorGreen;
    }



}



