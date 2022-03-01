package com.example.foodapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class Foodie extends BaseAdapter {
    private Context mContext  ;
    public Foodie(Context c){
        mContext=c;
    }
    public int getCount(){ return  mThumblIds.length; }
    public Object getItem(int position){ return null;}
    public long getItemId(int position){ return 0;}

    public View getView(int position, View convertView, ViewGroup parent ){
        ImageView imageView;
        if (convertView==null){
            imageView=new ImageView(mContext);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(500,600));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8,8,8,8);
        }
        else{
            imageView=(ImageView) convertView;
        }
        imageView.setImageResource(mThumblIds[position]);
        return imageView;

    }
    public Integer[]mThumblIds={
            R.drawable.burger, R.drawable.pastry,
            R.drawable.t1, R.drawable.noodles,
            R.drawable.pizza, R.drawable.sandwich

    };
}

