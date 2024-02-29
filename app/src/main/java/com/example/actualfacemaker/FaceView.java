package com.example.actualfacemaker;

import android.content.Context;
import android.view.SurfaceView;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.NonNull;

public class FaceView extends SurfaceView {

    Paint skin = new Paint();
    Paint eyes = new Paint();
    Paint hair = new Paint();


    Face faceModel;

    public FaceView(Context context) {
        super(context);
        faceModel = new Face();

    }

    public FaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        faceModel = new Face();
        setWillNotDraw(false);

        setBackgroundColor(Color.WHITE);

    }


    @Override
    public void onDraw(@NonNull Canvas canvas) {
        //draws skin
        super.onDraw(canvas);
        skin.setColor(Color.rgb(faceModel.skinColorRed,faceModel.skinColorGreen, faceModel.skinColorBlue));
        canvas.drawCircle(1000f, 450f, 200, skin);

        //draws eyes
        eyes.setColor(Color.rgb(faceModel.eyeColorRed,faceModel.eyeColorGreen, faceModel.eyeColorBlue));
        canvas.drawCircle(900f, 400f, 40, eyes);
        canvas.drawCircle(1100f, 400f, 40, eyes);


        //draws hair
        hair.setColor(Color.rgb(faceModel.hairColorRed,faceModel.hairColorGreen, faceModel.hairColorBlue));

        if (faceModel.hairStyle == 0) {
        } else if (faceModel.hairStyle == 1) {
            canvas.drawOval(800f, 225f, 1200f, 325f, hair);
        } else if (faceModel.hairStyle == 2) {
            canvas.drawOval(800f, 225f, 1200f, 325f, hair);
            canvas.drawOval(775f, 250f, 825f, 650f, hair);
            canvas.drawOval(1175f, 250f, 1225f, 650f, hair);
        }

    }

    public Face getModel(){
        return faceModel;
    }

}
