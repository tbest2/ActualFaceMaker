package com.example.actualfacemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.view.View;

import java.util.Random;


// @author Tramanh Best
//February 15

public class MainActivity extends AppCompatActivity {

FaceView bob;
Button randomFace;



    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bob = findViewById(R.id.faceView);
        FaceController robert = new FaceController(bob);

        randomFace = findViewById(R.id.randomFace);
        randomFace.setOnClickListener(robert);

        SeekBar red = findViewById(R.id.red);
        red.setOnSeekBarChangeListener(robert);

        SeekBar blue = findViewById(R.id.blue);
        blue.setOnSeekBarChangeListener(robert);

        SeekBar green = findViewById(R.id.green);
        green.setOnSeekBarChangeListener(robert);

        bob.setOnTouchListener(robert);
    }



}
