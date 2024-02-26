package com.example.actualfacemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.view.View;
import android.widget.Spinner;

import java.util.ArrayList;
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

        SeekBar red = findViewById(R.id.red);
        SeekBar blue = findViewById(R.id.blue);
        SeekBar green = findViewById(R.id.green);

        FaceController robert = new FaceController(bob, this);

        randomFace = findViewById(R.id.randomFace);
        randomFace.setOnClickListener(robert);

        Spinner hairStyle = findViewById(R.id.hairSpinner);
        hairStyle.setOnItemSelectedListener(robert);


        red.setOnSeekBarChangeListener(robert);
        blue.setOnSeekBarChangeListener(robert);
        green.setOnSeekBarChangeListener(robert);

        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(robert);

        bob.setOnTouchListener(robert);

        }






}
