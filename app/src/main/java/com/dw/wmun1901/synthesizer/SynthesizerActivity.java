package com.dw.wmun1901.synthesizer;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.provider.MediaStore.Audio;
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
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;
    private Button button15;
    private Button button16;

    private TextView BackgroundText; //BackgroundText
    private MediaPlayer mpA;
    private MediaPlayer mpB;
    private MediaPlayer mpBb;
    private MediaPlayer mpC;
    private MediaPlayer mpCsharp;
    private MediaPlayer mpD;
    private MediaPlayer mpDsharp;
    private MediaPlayer mpE;
    private MediaPlayer mpF;
    private MediaPlayer mpFsharp;
    private MediaPlayer mpG;
    private MediaPlayer mpGsharp;
    private MediaPlayer mphighE;
    private MediaPlayer mphighF;
    private MediaPlayer mphighFsharp;
    private MediaPlayer mphighG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);

        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        button10 = (Button)findViewById(R.id.button10);
        button11 = (Button)findViewById(R.id.button11);
        button12 = (Button)findViewById(R.id.button12);
        button13 = (Button)findViewById(R.id.button13);
        button14 = (Button)findViewById(R.id.button14);
        button15 = (Button)findViewById(R.id.button15);
        button16 = (Button)findViewById(R.id.button16);

        mpA = MediaPlayer.create(this, R.raw.scalea);
        mpB = MediaPlayer.create(this, R.raw.scaleb);
        mpBb = MediaPlayer.create(this, R.raw.scalebb);
        mpC = MediaPlayer.create(this, R.raw.scalec);
        mpCsharp = MediaPlayer.create(this, R.raw.scalecs);
        mpD = MediaPlayer.create(this, R.raw.scaled);
        mpDsharp = MediaPlayer.create(this, R.raw.scaleds);
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);
        mpFsharp = MediaPlayer.create(this, R.raw.scalefs);
        mpG = MediaPlayer.create(this, R.raw.scaleg);
        mpGsharp = MediaPlayer.create(this, R.raw.scalegs);
        mphighE = MediaPlayer.create(this, R.raw.scalehighe);
        mphighF = MediaPlayer.create(this, R.raw.scalehighf);
        mphighFsharp = MediaPlayer.create(this, R.raw.scalehighfs);
        mphighG = MediaPlayer.create(this, R.raw.scalehighg);




        BackgroundText = (TextView)findViewById(R.id.BackgroundText);
        final int[] Ammount1 = {1};
        final int[] Ammount2 = {1};






        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.i(TAG, "Button 1 Clicked");
                Ammount1[0]++;
                BackgroundText.setText("Button 1 Clicked " + Ammount1[0] + "times");
                mpA.start();

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Button 2 Clicked");
                Ammount2[0]++;
                BackgroundText.setText("Button 2 Clicked " + Ammount2[0] + "times");
                mpBb.start();

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Button Clicked");
                BackgroundText.setText("Button  Clicked ");
                mpB.start();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Button Clicked");
                BackgroundText.setText("Button  Clicked ");
                mpC.start();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Button Clicked");
                BackgroundText.setText("Button  Clicked ");
                mpCsharp.start();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Button Clicked");
                BackgroundText.setText("Button  Clicked ");
                mpD.start();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Button Clicked");
                BackgroundText.setText("Button  Clicked ");
                mpDsharp.start();
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Button Clicked");
                BackgroundText.setText("Button  Clicked ");
                mpE.start();
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Button Clicked");
                BackgroundText.setText("Button  Clicked ");
                mpF.start();
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Button Clicked");
                BackgroundText.setText("Button  Clicked ");
                mpFsharp.start();
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Button Clicked");
                BackgroundText.setText("Button  Clicked ");
                mpG.start();
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.i(TAG, "Button Clicked");
                    BackgroundText.setText("Button  Clicked ");
                    mpGsharp.start();
                }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Button Clicked");
                BackgroundText.setText("Button  Clicked ");
                mphighE.start();
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Button Clicked");
                BackgroundText.setText("Button  Clicked ");
                mphighF.start();
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Button Clicked");
                BackgroundText.setText("Button  Clicked ");
                mphighFsharp.start();
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Button Clicked");
                BackgroundText.setText("Button  Clicked ");
                mphighG.start();
            }
        });



    }
}
