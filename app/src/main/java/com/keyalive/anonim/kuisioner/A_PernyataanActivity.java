package com.keyalive.anonim.kuisioner;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.keyalive.anonim.kuisioner.Auditori.AuhActivity;
import com.keyalive.anonim.kuisioner.Kinestetik.KshActivity;
import com.keyalive.anonim.kuisioner.Visual.VshActivity;

public class A_PernyataanActivity extends AppCompatActivity {

    private TextView txtnama;
    private RadioGroup rgYt;
    private RadioButton rbYa;
    private RadioButton rbTidak;
    private RadioButton rbLk;
    private RadioButton rbPr;
    private TextView score;

    int skor = 0;
    int arr;
    int x;
    String jawaban;

    SoalYaTidak soalyt = new SoalYaTidak();
    private TextView txtsoal;
    private TextView txtPi;
    private ImageView ivmulai;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a__pernyataan);
        initView();

//        stateawal();
        mp=new MediaPlayer();
        mp = MediaPlayer.create(getApplicationContext(), R.raw.click);


        score.setText("" + skor);
        setKontent();
        if (getIntent().getExtras() != null) {
            /**
             * Jika Bundle ada, ambil data dari Bundle
             */
            Bundle bundle = getIntent().getExtras();
            txtnama.setText(bundle.getString("nama"));
        }

        ivmulai.setOnClickListener(
                new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
//
                cekJawaban();
            }
        });
    }

//

    private void cekJawaban() {
        if (rbYa.isChecked()) {
            skor = skor + 1;
            score.setText("" + skor);
            setKontent();
        }
        if (rbTidak.isChecked()) {
            setKontent();
        } else {
//            Toast.makeText(this, "Silahkan pilih jawaban dulu!", Toast.LENGTH_SHORT).show();
        }
    }

    private void setKontent() {
        rgYt.clearCheck();
        arr = soalyt.pertanyaan.length;

        if (x >= arr) {
            int jumlahSkor = skor;
            if (jumlahSkor >= 25 & jumlahSkor <= 36) {
                Bundle bundle = new Bundle();
                bundle.putString("nama", txtnama.getText().toString());
                Intent i = new Intent(A_PernyataanActivity.this,KshActivity.class);
                i.putExtras(bundle);
                startActivity(i);
                finish();

            }else if(jumlahSkor > 13 && jumlahSkor < 24) {
                Bundle bundle = new Bundle();
                bundle.putString("nama", txtnama.getText().toString());
                Intent i = new Intent(A_PernyataanActivity.this, AuhActivity.class);
                i.putExtras(bundle);
                startActivity(i);
                finish();
            }else{
                Bundle bundle = new Bundle();
                bundle.putString("nama", txtnama.getText().toString());
                Intent i = new Intent(A_PernyataanActivity.this, VshActivity.class);
                i.putExtras(bundle);
                startActivity(i);
                finish();
//            } else if (jumlahSkor > 1 && jumlahSkor < 12) {
//                Bundle bundle = new Bundle();
//                bundle.putString("nama", txtnama.getText().toString());
//                Intent i = new Intent(A_PernyataanActivity.this,VshActivity.class);
//                i.putExtras(bundle);
//                startActivity(i);
//                finish();

            }
        } else {
            txtsoal.setText(soalyt.getPertanyaan(x));
            rbYa.setText(soalyt.getPilihanJawaban1(x));
            rbTidak.setText(soalyt.getPilihanJawaban2(x));
            jawaban = soalyt.getJawabanBenar(x);
        }
        x++;

    }


    private void initView() {
        txtnama = (TextView) findViewById(R.id.txtnama);
        rgYt = (RadioGroup) findViewById(R.id.rg_yt);
        rbYa = (RadioButton) findViewById(R.id.rb_ya);
        rbTidak = (RadioButton) findViewById(R.id.rb_tidak);
        score = (TextView) findViewById(R.id.score);
        txtsoal = (TextView) findViewById(R.id.txtsoal);
        txtPi = (TextView) findViewById(R.id.txtPi);


        String customFont = "fgc.ttf";
        Typeface typeface = Typeface.createFromAsset(getAssets(), customFont);

        String customFonts = "comic.ttf";
        Typeface typefaces = Typeface.createFromAsset(getAssets(), customFonts);

        txtnama.setTypeface(typefaces);
        txtPi.setTypeface(typefaces);

        txtsoal.setTypeface(typeface);
        rbYa.setTypeface(typeface);
        rbTidak.setTypeface(typeface);
        ivmulai = (ImageView) findViewById(R.id.ivmulai);
    }

    public void onBackPressed() {
        Toast.makeText(this, "selesaikan test terlebih dahulu", Toast.LENGTH_SHORT).show();
        //jadi yang awalnya klik tombol back maka akan kembali ke activity sebelumnya
        //kali ini ketika tombol back diklik maka
        //hanya muncul Toast
    }
}
