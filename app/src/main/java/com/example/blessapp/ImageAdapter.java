package com.example.blessapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    //Add all our images to arrayList
    public Integer[] thumbImages = {
            R.drawable.bbromper, R.drawable.rose,

    };

    public ImageAdapter(Context c) { mContext = c; }
    public int getCount() { return thumbImages.length; }
    public Object getItem(int position) { return null; }

    public long getItemId(int position) {
        return 0;
    }

    //create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent ) {
        ImageView imageView = new ImageView(mContext);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(800, 800));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(8,8,8,8);
        imageView.setImageResource(thumbImages[position]);
        return imageView;
    }
}
