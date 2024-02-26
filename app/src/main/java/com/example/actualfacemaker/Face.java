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

    void updateSkin(){
        skinColorRed = redNow;
        skinColorBlue = blueNow;
        skinColorGreen = greenNow;
    }

    void updateHair(){
        hairColorRed = redNow;
        hairColorBlue = blueNow;
        hairColorGreen = greenNow;
    }

    void updateEyes(){
        eyeColorRed = redNow;
        eyeColorBlue = blueNow;
        eyeColorGreen = greenNow;
    }




    int getHairS(){
        return hairStyle;
    }
}



