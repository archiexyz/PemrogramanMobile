package com.example.hitungrumus;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class PersegiFragment extends Fragment {
    private Button btnKeliling,btnLuas;
    private EditText sisipersegi;
    private TextView hasilkeliling,hasilluas;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_persegi, container, false);
        btnKeliling = v.findViewById(R.id.btnKeliling);
        btnLuas = v.findViewById(R.id.btnLuas);
        sisipersegi = v.findViewById(R.id.sisipersegi);
        hasilkeliling = v.findViewById(R.id.hasilkeliling);
        hasilluas = v.findViewById(R.id.hasilluas);

        btnKeliling.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String nilai = sisipersegi.getText().toString();
                if (nilai.isEmpty()) {
                    sisipersegi.setError("Sisi Tidak Boleh Kosong");
                } else {
                    Integer sisi = Integer.parseInt(nilai);

                    Integer Keliling = sisi * 4;
                    hasilkeliling.setText(String.valueOf(Keliling));
                }
            }
        });

        btnLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nilai = sisipersegi.getText().toString();
                if (nilai.isEmpty()) {
                    sisipersegi.setError("Sisi Tidak Boleh Kosong");
                } else {
                    Integer sisi = Integer.parseInt(nilai);

                    Integer Luas = sisi * sisi;
                    hasilluas.setText(String.valueOf(Luas));
                }
            }
        });
        return v;
    }
}