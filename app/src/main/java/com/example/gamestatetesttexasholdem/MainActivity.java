package com.example.gamestatetesttexasholdem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //grab references
        Button test = findViewById(R.id.runTestButton);
        TextView text = findViewById(R.id.editText);

        //create and set listener
        Controller controller = new Controller(text);
        test.setOnClickListener(controller);
    }
}