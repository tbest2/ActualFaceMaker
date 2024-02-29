package com.example.actualfacemaker;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;

public class FaceController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener,
        SeekBar.OnSeekBarChangeListener, View.OnTouchListener, RadioGroup.OnCheckedChangeListener,
        AdapterView.OnItemSelectedListener
{

    FaceView mainFaceView;
    Face mainFaceModel;
    int mode;
    //help from friend to reference main
    private MainActivity main;


    FaceController(FaceView initFaceView, MainActivity myMainActivity){
    mainFaceView = initFaceView;
    mainFaceModel = mainFaceView.getModel();
    this.main = myMainActivity;

    }



    //seek bars change colors according to which radio button mode
    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        if(seekBar.getId() == R.id.red) {
            if (mode == 1) {
                mainFaceModel.hairColorRed = progress;
            } else if (mode == 2) {
                mainFaceModel.eyeColorRed = progress;
            } else if (mode == 3) {
                mainFaceModel.skinColorRed = progress;
            }
        }

        if(seekBar.getId() == R.id.blue) {
            if (mode == 1) {
                mainFaceModel.hairColorBlue = progress;
            } else if (mode == 2) {
                mainFaceModel.eyeColorBlue = progress;
            } else if (mode == 3) {
                mainFaceModel.skinColorBlue = progress;
            }
        }

        if(seekBar.getId() == R.id.green) {
            if (mode == 1) {
                mainFaceModel.hairColorGreen = progress;
            } else if (mode == 2) {
                mainFaceModel.eyeColorGreen = progress;
            } else if (mode == 3) {
                mainFaceModel.skinColorGreen = progress;
            }
        }


        mainFaceView.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }

    @Override
    public void onClick(View v) {
        Log.d("face", "please");
        mainFaceModel.randomizer();
        mainFaceView.invalidate();

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

    }
    //help from overstack to figure what the int was
    //depending on which what radio button, changes mode to match body part and updates the bars
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {


    if(checkedId == 2131231227){
        Log.d("radio", "id hair" + checkedId );
        mode = 1;
        updateColors(1);
    } else if(checkedId == 2131231226) {
        Log.d("radio", "id eyes" + checkedId );
        mode = 2;
        updateColors(2);
    } else if(checkedId == 2131231228) {
        Log.d("radio", "id skin" + checkedId );
        mode = 3;
        updateColors(3);
    }
    mainFaceView.invalidate();
    }



    //to update bars according to colors saved
    public void updateColors(int mo) {
        updateBar(R.id.red, mainFaceModel.getRed(mo));
        updateBar(R.id.green, mainFaceModel.getGreen(mo));
        updateBar(R.id.blue, mainFaceModel.getBlue(mo));
    }
    public void updateBar(int id, int color){
        SeekBar seekbar = main.findViewById(id);
        seekbar.setProgress(color);
    }



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        mainFaceModel.hairStyle = position;
        mainFaceView.invalidate();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
