package com.keyalive.anonim.kuisioner.Visual;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.keyalive.anonim.kuisioner.R;

public class VshActivity extends AppCompatActivity {

    private TextView txtPetunjuk;
    private ImageView btnlihat;
    MediaPlayer mp;
    private TextView txtPi;
    private TextView txtnama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_vs);
        initView();
        mp = new MediaPlayer();
        mp = MediaPlayer.create(getApplicationContext(), R.raw.click);
        if (getIntent().getExtras() != null) {
            /**
             * Jika Bundle ada, ambil data dari Bundle
             */
            Bundle bundle = getIntent().getExtras();
            txtnama.setText(bundle.getString("nama"));
        }
        initView();
        btnlihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                startActivity(new Intent(VshActivity.this, VsActivity.class));
                finish();


            }
        });
    }


    private void initView() {
        txtPetunjuk = (TextView) findViewById(R.id.txtPetunjuk);
        btnlihat = (ImageView) findViewById(R.id.btnlihat);
        txtPi = (TextView) findViewById(R.id.txtPi);
        txtnama = (TextView) findViewById(R.id.txtnama);
    }
}
