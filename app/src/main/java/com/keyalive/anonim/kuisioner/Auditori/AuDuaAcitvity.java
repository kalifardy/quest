package com.keyalive.anonim.kuisioner.Auditori;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.keyalive.anonim.kuisioner.MainActivity;
import com.keyalive.anonim.kuisioner.R;

public class AuDuaAcitvity extends AppCompatActivity {

    private ImageView ivsebelum;
    private ImageView ivkembali;
    private ImageView ivlanjut;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_au_dua_acitvity);
        initView();
        mp=new MediaPlayer();
        mp = MediaPlayer.create(getApplicationContext(), R.raw.click);



        ivsebelum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                ivsebelum.setEnabled(false);
                startActivity(new Intent(AuDuaAcitvity.this,AuActivity.class));
                finish();

            }
        });
        ivkembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                ivkembali.setEnabled(false);
                startActivity(new Intent(AuDuaAcitvity.this,MainActivity.class));
                finish();

            }
        });
    }


    private void initView() {
        ivsebelum = (ImageView) findViewById(R.id.ivsebelum);
        ivkembali = (ImageView) findViewById(R.id.ivkembali);
    }
    public void onBackPressed() {
        //jadi yang awalnya klik tombol back maka akan kembali ke activity sebelumnya
        //kali ini ketika tombol back diklik maka
        //hanya muncul Toast
    }
}
