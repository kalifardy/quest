package com.keyalive.anonim.kuisioner;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class PetunjukActivity extends AppCompatActivity {

    private TextView txtnama;
    private RadioButton rbLk;
    private RadioButton rbPr;
    private ImageView mulai;
    private TextView txtPetunjuk;
    private TextView hsatu;
    private TextView hdua;
    private TextView htiga;
    private ImageView ivkembali;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petunjuk);


        mp = new MediaPlayer();
        mp = MediaPlayer.create(getApplicationContext(), R.raw.click);

        String customFont = "fgc.ttf";
        Typeface typeface = Typeface.createFromAsset(getAssets(), customFont);

        String customFonts = "comic.ttf";
        Typeface typefaces = Typeface.createFromAsset(getAssets(), customFonts);

        txtnama = (TextView) findViewById(R.id.txtnama);
        rbLk = (RadioButton) findViewById(R.id.rb_lk);
        rbPr = (RadioButton) findViewById(R.id.rb_pr);
        mulai = (ImageView) findViewById(R.id.mulai);
        txtPetunjuk = (TextView) findViewById(R.id.txtPetunjuk);
        hsatu = (TextView) findViewById(R.id.hsatu);
        hdua = (TextView) findViewById(R.id.hdua);
        htiga = (TextView) findViewById(R.id.htiga);
        ivkembali = (ImageView) findViewById(R.id.ivkembali);


        txtnama.setTypeface(typefaces);
        txtPetunjuk.setTypeface(typefaces);

        hsatu.setTypeface(typeface);
        hdua.setTypeface(typeface);
        htiga.setTypeface(typeface);
        rbLk.setTypeface(typeface);
        rbPr.setTypeface(typeface);


        ivkembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                startActivity(new Intent(PetunjukActivity.this, PengisianActivity.class));
                finish();

            }
        });

        mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Bundle bundle = new Bundle();
                bundle.putString("nama", txtnama.getText().toString());
                Intent i = new Intent(PetunjukActivity.this, A_PernyataanActivity.class);
                i.putExtras(bundle);
                startActivity(i);
                finish();

            }
        });
        if (getIntent().getExtras() != null) {
            Bundle bundle = getIntent().getExtras();
            txtnama.setText(bundle.getString("nama"));
        }
            }
    public void onBackPressed() {
        Toast.makeText(this, "selesaikan test terlebih dahulu", Toast.LENGTH_SHORT).show();
        //jadi yang awalnya klik tombol back maka akan kembali ke activity sebelumnya
        //kali ini ketika tombol back diklik maka
        //hanya muncul Toast
    }


}

