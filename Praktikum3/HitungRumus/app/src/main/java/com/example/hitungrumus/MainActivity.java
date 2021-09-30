package com.example.hitungrumus;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Persegi(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new PersegiFragment()).commit();
    }

    public void Segitiga(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new SegitigaFragment()).commit();
    }

    public void Lingkaran(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new LingkaranFragment()).commit();
    }

    public void Kubus(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new KubusFragment()).commit();
    }
}