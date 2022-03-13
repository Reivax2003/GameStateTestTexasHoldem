package com.example.gamestatetesttexasholdem;

import android.view.View;
import android.widget.TextView;

public class Controller implements View.OnClickListener {

    private TextView text; //text displayed on screen

    public Controller(TextView text) {
        this.text = text;
    }

    //clear text
    @Override
    public void onClick(View view) {
        text.setText("");
    }
}
