package com.example.ayamku;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import java.util.ArrayList;


class AyamAdapter extends RecyclerView.Adapter<AyamAdapter.AyamViewHolder>  {

    private GradientDrawable mGradientDrawable;
    private ArrayList<Ayam> mAyamData;
    private Context mContext;

    AyamAdapter(Context context, ArrayList<Ayam> ayamData) {
        this.mAyamData = ayamData;
        this.mContext = context;

        mGradientDrawable = new GradientDrawable();
        mGradientDrawable.setColor(Color.GRAY);

        Drawable drawable = ContextCompat.getDrawable
                (mContext,R.drawable.ayam1);
        if(drawable != null) {
            mGradientDrawable.setSize(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    @Override
    public AyamViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new AyamViewHolder(mContext, LayoutInflater.from(mContext).
                inflate(R.layout.list_item, parent, false), mGradientDrawable);
    }

    @Override
    public void onBindViewHolder(AyamViewHolder holder, int position) {

        Ayam currentAyam = mAyamData.get(position);

        holder.bindTo(currentAyam);

    }

    @Override
    public int getItemCount() {
        return mAyamData.size();
    }

    static class AyamViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {

        private TextView mTitleText;
        private TextView mInfoText;
        private ImageView mAyamImage;
        private Context mContext;
        private Ayam mCurrentAyam;
        private GradientDrawable mGradientDrawable;

        AyamViewHolder(Context context, View itemView, GradientDrawable gradientDrawable) {
            super(itemView);

            mTitleText = (TextView)itemView.findViewById(R.id.ayamTitle);
            mInfoText = (TextView)itemView.findViewById(R.id.subTitle);
            mAyamImage = (ImageView)itemView.findViewById(R.id.ayamImage);
            mContext = context;
            mGradientDrawable = gradientDrawable;
            itemView.setOnClickListener(this);
        }

        void bindTo(Ayam currentAyam){
            mTitleText.setText(currentAyam.getTitle());
            mInfoText.setText(currentAyam.getInfo());

            mCurrentAyam = currentAyam;

            Glide.with(mContext).load(currentAyam.
                    getImageResource()).placeholder(mGradientDrawable).into(mAyamImage);
        }

        @Override
        public void onClick(View view) {

            Intent detailIntent = Ayam.starter(mContext, mCurrentAyam.getTitle(),
                    mCurrentAyam.getImageResource());

            mContext.startActivity(detailIntent);
        }
    }
}
