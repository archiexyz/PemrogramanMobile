package com.example.hitungrumus;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LingkaranFragment extends Fragment {
    private Button btnKeliling,btnLuas;
    private EditText jarilingkaran;
    private TextView hasilkeliling,hasilluas;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_lingkaran, container, false);
        btnKeliling = v.findViewById(R.id.btnKeliling);
        btnLuas = v.findViewById(R.id.btnLuas);
        jarilingkaran = v.findViewById(R.id.jarilingkaran);
        hasilkeliling = v.findViewById(R.id.hasilkeliling);
        hasilluas = v.findViewById(R.id.hasilluas);

        btnKeliling.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String nilai = jarilingkaran.getText().toString();
                if (nilai.isEmpty()) {
                    jarilingkaran.setError("Jari-jari Tidak Boleh Kosong");
                } else {
                    Integer jari = Integer.parseInt(nilai);

                    double Keliling = 2 * 3.14 * jari;
                    hasilkeliling.setText(String.valueOf(Keliling));
                }
            }
        });

        btnLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nilai = jarilingkaran.getText().toString();
                if (nilai.isEmpty()) {
                    jarilingkaran.setError("Sisi Tidak Boleh Kosong");
                } else {
                    Integer jari= Integer.parseInt(nilai);

                    double Luas = 3.14 * jari * jari;
                    hasilluas.setText(String.valueOf(Luas));
                }
            }
        });

        return v;
    }
}