package com.keyalive.anonim.kuisioner.Visual;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.keyalive.anonim.kuisioner.MainActivity;
import com.keyalive.anonim.kuisioner.R;

public class VsDuaAcitivity extends AppCompatActivity {

    private ImageView ivsebelum;
    private ImageView ivkembali;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vs_dua_acitivity);
        initView();

        mp = new MediaPlayer();
        mp = MediaPlayer.create(getApplicationContext(), R.raw.click);

        ivsebelum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                startActivity(new Intent(VsDuaAcitivity.this,VsActivity.class));
                finish();

            }
        });
        ivkembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
               startActivity(new Intent(VsDuaAcitivity.this,MainActivity.class));
                finish();


            }
        });
    }



    private void initView() {
        ivsebelum = (ImageView) findViewById(R.id.ivsebelum);
        ivkembali = (ImageView) findViewById(R.id.ivkembali);
    }
    public void onBackPressed() {
        Toast.makeText(this, "selesaikan test terlebih dahulu", Toast.LENGTH_SHORT).show();
        //jadi yang awalnya klik tombol back maka akan kembali ke activity sebelumnya
        //kali ini ketika tombol back diklik maka
        //hanya muncul Toast
    }
}
