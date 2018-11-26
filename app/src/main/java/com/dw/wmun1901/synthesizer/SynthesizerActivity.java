package com.dw.wmun1901.synthesizer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SynthesizerActivity extends AppCompatActivity {
    private static final String TAG =
SynthesizerActivity.class.getName();
    private Button button1;
    private Button button2;
    private TextView BackgroundText; //BackgroundText
    private int Ammount = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);

        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        BackgroundText = (TextView)findViewById(R.id.BackgroundText);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Log.i(TAG, "Button 1 Clicked");
                BackgroundText.setText("Button 1 Clicked" + Ammount);
                Ammount = Ammount ++;
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Button 2 Clicked");
            }
        });
    }
}
