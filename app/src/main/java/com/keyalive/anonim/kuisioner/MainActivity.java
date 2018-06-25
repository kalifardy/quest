package com.keyalive.anonim.kuisioner;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private ImageView btnId;
    private ImageView btnKeluar;
    private MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mp = new MediaPlayer();
        mp = MediaPlayer.create(getApplicationContext(), R.raw.click);


        setContentView(R.layout.activity_main);
        btnId = (ImageView) findViewById(R.id.btnId);
        btnKeluar = (ImageView) findViewById(R.id.btnKeluar);
        

        btnId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent = new Intent(MainActivity.this, PengisianActivity.class);
                startActivity(intent);
                finish();


            }
        });
        btnKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               mp.start();

                finish();
                System.exit(0);
            }


        });
    }






}
