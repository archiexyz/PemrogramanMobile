package com.example.ayamku;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView ayamTitle = (TextView)findViewById(R.id.ayamTitleDetail);
        ImageView ayamImage = (ImageView)findViewById(R.id.ayamImageDetail);

        Drawable drawable = ContextCompat.getDrawable
                (this,getIntent().getIntExtra(Ayam.IMAGE_KEY, 0));

        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.GRAY);

        if(drawable!=null) {
            gradientDrawable.setSize(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }

        ayamTitle.setText(getIntent().getStringExtra(Ayam.TITLE_KEY));

        Glide.with(this).load(getIntent().getIntExtra(Ayam.IMAGE_KEY,0))
                .placeholder(gradientDrawable).into(ayamImage);
    }
}