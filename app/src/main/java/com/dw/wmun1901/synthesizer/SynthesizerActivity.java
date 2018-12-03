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
        private final int WHOLE_NOTE = 100;
        private static final String TAG =
                SynthesizerActivity.class.getName();

        private Button button17;
        private Button buttonM;

        private TextView BackgroundText; //BackgroundText
        private MediaPlayer mphighF;
        private MediaPlayer mphighFsharp;
        private MediaPlayer robFinal;

        private void delayPlaying(int delay){
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                Log.e("SynthesizerActivity","Audio playback interrupted");
            }
        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_synthesizer);

            button17 = (Button) findViewById(R.id.button17);
            buttonM = (Button) findViewById(R.id.buttonM);

            robFinal = MediaPlayer.create(this, R.raw.robfinal);
            mphighF = MediaPlayer.create(this, R.raw.scalehighf);
            mphighFsharp = MediaPlayer.create(this, R.raw.scalehighfs);


            BackgroundText = (TextView) findViewById(R.id.BackgroundText);
            final int[] Ammount1 = {1};
            final int[] Ammount2 = {1};





            button17.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.i(TAG, "Button Clicked");
                    BackgroundText.setText("Button  Clicked ");
                    mphighFsharp.seekTo(0);
                    Log.e("SynthesizerActivity", "Button  clicked");
                    MediaPlayer rPlayer = MediaPlayer.create(SynthesizerActivity.this, R.raw.robfinal);

                    rPlayer.start();

                }
            });
            buttonM.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.i(TAG, "Button Clicked");
                    BackgroundText.setText("Button  Clicked ");
                    mphighF.seekTo(0);
                    Log.e("SynthesizerActivity", "Button  clicked");
                    MediaPlayer mPlayer = MediaPlayer.create(SynthesizerActivity.this, R.raw.megalovania);

                    mPlayer.start();
                    delayPlaying(5000);
                    mPlayer.stop(); 
                }
            });



        }
    }

