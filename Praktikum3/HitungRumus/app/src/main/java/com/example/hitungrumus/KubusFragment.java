package com.example.hitungrumus;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KubusFragment extends Fragment {
    private Button btnLuas,btnVolume;
    private EditText panjangrusuk;
    private TextView hasilvolume,hasilluas;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_kubus, container, false);
        btnLuas = v.findViewById(R.id.btnLuas);
        btnVolume = v.findViewById(R.id.btnVolume);
        panjangrusuk = v.findViewById(R.id.panjangrusuk);
        hasilvolume = v.findViewById(R.id.hasilvolume);
        hasilluas = v.findViewById(R.id.hasilluas);

        btnLuas.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String nilai = panjangrusuk.getText().toString();
                if (nilai.isEmpty()) {
                    panjangrusuk.setError("Rusuk Tidak Boleh Kosong");
                } else {
                    Integer sisi = Integer.parseInt(nilai);

                    Integer Luas = 6 * sisi * sisi;
                    hasilluas.setText(String.valueOf(Luas));
                }
            }
        });

        btnVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nilai = panjangrusuk.getText().toString();
                if (nilai.isEmpty()) {
                    panjangrusuk.setError("Rusuk Tidak Boleh Kosong");
                } else {
                    Integer sisi = Integer.parseInt(nilai);

                    Integer Volume = sisi * sisi * sisi;
                    hasilvolume.setText(String.valueOf(Volume));
                }
            }
        });
        return v;
    }
}