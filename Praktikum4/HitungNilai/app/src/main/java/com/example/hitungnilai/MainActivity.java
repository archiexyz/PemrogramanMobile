package com.example.hitungnilai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText nim,nama,ntugas,nuts,nuas,nakhir,vtugas,vuts,vuas,nhuruf,predikat;
    private Double htugas,huts,huas,vakhir,vptugas,vputs,vpuas;
    private String vhuruf,vpredikat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nim = (EditText) findViewById(R.id.nim);
        nama = (EditText) findViewById(R.id.nama);
        ntugas = (EditText) findViewById(R.id.ntugas);
        vtugas = (EditText) findViewById(R.id.vtugas);
        nuts = (EditText) findViewById(R.id.nuts);
        vuts = (EditText) findViewById(R.id.vuts);
        nuas = (EditText) findViewById(R.id.nuas);
        vuas = (EditText) findViewById(R.id.vuas);
        nakhir = (EditText) findViewById(R.id.nakhir);
        nhuruf = (EditText) findViewById(R.id.nhuruf);
        predikat = (EditText) findViewById(R.id.predikat);
    }

    public void Hasil(View view) {
        htugas = Double.parseDouble(ntugas.getText().toString());
        huts = Double.parseDouble(nuts.getText().toString());
        huas = Double.parseDouble(nuas.getText().toString());

        vptugas =(0.30 * htugas);
        vputs = (0.35 * huts);
        vpuas = (0.35 * huas);

        vakhir = vptugas + vputs + vpuas;

        if (vakhir >=85 && vakhir<=100){
            vhuruf = "A";
            vpredikat = "Apik";
        }else if (vakhir >=80 && vakhir<=84){
            vhuruf = "AB";
            vpredikat = "Apik Banget";
        }else if (vakhir >=70 && vakhir<=79){
            vhuruf = "B";
            vpredikat = "Baik";
        }else if (vakhir >=65 && vakhir<=69){
            vhuruf = "BC";
            vpredikat = "Baik Cukup";
        }else if (vakhir >=60 && vakhir<=64){
            vhuruf = "C";
            vpredikat = "Cukup";
        }else if (vakhir >=50 && vakhir<=59){
            vhuruf = "D";
            vpredikat = "Dablek";
        }else {
            vhuruf = "E";
            vpredikat = "Elek";
        }

        vtugas.setText(" "+vptugas);
        vuts.setText(" "+vputs);
        vuas.setText(" "+vpuas);
        nakhir.setText(" "+vakhir);
        nhuruf.setText(" "+vhuruf);
        predikat.setText(" "+vpredikat);
    }
}