package com.example.hitungrumus;

import android.os.Bundle;

import androidx.core.app.RemoteInput;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SegitigaFragment extends Fragment {
    private Button btnKeliling,btnLuas;
    private EditText sisisegitiga,tinggisegitiga;
    private TextView hasilkeliling,hasilluas;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_segitiga, container, false);
        btnKeliling = v.findViewById(R.id.btnKeliling);
        btnLuas = v.findViewById(R.id.btnLuas);
        sisisegitiga = v.findViewById(R.id.sisisegitiga);
        tinggisegitiga = v.findViewById(R.id.tinggisegitiga);
        hasilkeliling = v.findViewById(R.id.hasilkeliling);
        hasilluas = v.findViewById(R.id.hasilluas);

        btnKeliling.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String nilai = sisisegitiga.getText().toString();
                if (nilai.isEmpty()) {
                    sisisegitiga.setError("Sisi Tidak Boleh Kosong");
                } else {
                    Integer sisi = Integer.parseInt(nilai);

                    Integer Keliling = sisi * 3;
                    hasilkeliling.setText(String.valueOf(Keliling));
                }
            }
        });

        btnLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nilai = sisisegitiga.getText().toString();
                String nilai1 = tinggisegitiga.getText().toString();
                if (nilai.isEmpty()) {
                    sisisegitiga.setError("Sisi Tidak Boleh Kosong");
                }else if(nilai1.isEmpty()){
                    tinggisegitiga.setError("Tinggi Tidak Boleh Kosong");
                }else {
                    Integer sisi = Integer.parseInt(nilai);
                    Integer tinggi = Integer.parseInt(nilai1);

                    Integer Luas = sisi * tinggi / 2;
                    hasilluas.setText(String.valueOf(Luas));
                }
            }
        });

        return v;
    }
}