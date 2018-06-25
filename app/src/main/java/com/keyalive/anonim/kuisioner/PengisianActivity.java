package com.keyalive.anonim.kuisioner;

import android.annotation.TargetApi;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.icu.text.SimpleDateFormat;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Locale;

@TargetApi(Build.VERSION_CODES.N)
public class PengisianActivity extends AppCompatActivity {

    private EditText edtNama;
    private Spinner spUsia;
    private Spinner spKelas;
    private RadioButton rbLk;
    private RadioButton rbPr;
    private ImageView btnSelanjutnya;
    private EditText tgl;
    private SimpleDateFormat dateFormatter;
    private TextView txtPi;
    private TextView txtnama;
    private TextView txusia;
    private TextView txtkelas;
    private TextView txtkel;
    private TextView txttgl;

    private static final SimpleDateFormat formatter = new SimpleDateFormat(
            "yyyy-MM-dd", Locale.ENGLISH);

    private ImageView ivkembali;

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengisian);
        initView();


        mp = new MediaPlayer();
        mp = MediaPlayer.create(getApplicationContext(), R.raw.click);



        tgl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar newCalendar = Calendar.getInstance();

                DatePickerDialog datePickerDialog = new DatePickerDialog(PengisianActivity.this, new DatePickerDialog.OnDateSetListener() {

                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                        Calendar newDate = Calendar.getInstance();
                        newDate.set(year, monthOfYear, dayOfMonth);
                        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
                        tgl.setText(" " + dateFormatter.format(newDate.getTime()));
                    }

                }, newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

                datePickerDialog.show();
            }
        });


        String[] umur = {"--Pilih Umur Anda--", "10", "11", "12", "13", "14", "15", "16", "17", "18"};
        ArrayAdapter<String> adapterUmur = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, umur);
        spUsia.setAdapter(adapterUmur);

        String[] kelas = {"--Pilih kelas Anda--", "10", "11", "12"};
        ArrayAdapter<String> adapterKelas = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, kelas);
        spKelas.setAdapter(adapterKelas);


        btnSelanjutnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Bundle bundle = new Bundle();
                bundle.putString("nama", edtNama.getText().toString());
                Intent i = new Intent(PengisianActivity.this, PetunjukActivity.class);
                i.putExtras(bundle);
                startActivity(i);
                finish();

            }
        });

        ivkembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                startActivity(new Intent(PengisianActivity.this,MainActivity.class));
                finish();

            }
        });

        tgl.setInputType(InputType.TYPE_NULL);
    }


    private void initView() {
        edtNama = (EditText) findViewById(R.id.edt_nama);
        spUsia = (Spinner) findViewById(R.id.sp_usia);
        spKelas = (Spinner) findViewById(R.id.sp_kelas);
        rbLk = (RadioButton) findViewById(R.id.rb_lk);
        rbPr = (RadioButton) findViewById(R.id.rb_pr);
        btnSelanjutnya = (ImageView) findViewById(R.id.btn_selanjutnya);
        tgl = (EditText) findViewById(R.id.tgl);
        txtPi = (TextView) findViewById(R.id.txtPi);
        txtnama = (TextView) findViewById(R.id.txtnama);
        txusia = (TextView) findViewById(R.id.txusia);
        txtkelas = (TextView) findViewById(R.id.txtkelas);
        txtkel = (TextView) findViewById(R.id.txtkel);
        txttgl = (TextView) findViewById(R.id.txttgl);

        String customFont = "fgc.ttf";
        Typeface typeface = Typeface.createFromAsset(getAssets(), customFont);

        String customFonts = "comic.ttf";
        Typeface typefaces = Typeface.createFromAsset(getAssets(), customFonts);

        txtPi.setTypeface(typefaces);

        txtnama.setTypeface(typeface);
        txusia.setTypeface(typeface);
        txtkelas.setTypeface(typeface);
        txtkel.setTypeface(typeface);
        txttgl.setTypeface(typeface);
        rbLk.setTypeface(typeface);
        rbPr.setTypeface(typeface);


        ivkembali = (ImageView) findViewById(R.id.ivkembali);
    }
    protected void onStop(){
        super.onStop();
    }

}
