package com.keyalive.anonim.kuisioner.Kinestetik;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.keyalive.anonim.kuisioner.R;

public class KsActivity extends AppCompatActivity {

    private ImageView ivlanjut;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ks);
        initView();
        mp=new MediaPlayer();
        mp = MediaPlayer.create(getApplicationContext(), R.raw.click);

        ivlanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                ivlanjut.setEnabled(false);
                startActivity(new Intent(KsActivity.this,KsDuaActivity.class));
                finish();


            }
        });
    }

    private void initView() {
        ivlanjut = (ImageView) findViewById(R.id.ivlanjut);
    }
    public void onBackPressed() {
        //jadi yang awalnya klik tombol back maka akan kembali ke activity sebelumnya
        //kali ini ketika tombol back diklik maka
        //hanya muncul Toast
    }
}
