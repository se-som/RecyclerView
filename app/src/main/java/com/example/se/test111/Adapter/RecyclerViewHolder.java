package com.example.se.test111.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.se.test111.R;

/**
 * Created by Se on 6/2/2016.
 */
public class RecyclerViewHolder extends RecyclerView.ViewHolder{
    TextView tv1,tv2;
    ImageView imageView;
    View mRoot;

    public RecyclerViewHolder(View itemView) {
        super(itemView);
        mRoot = itemView;
        tv1= (TextView) itemView.findViewById(R.id.list_title);
        tv2= (TextView) itemView.findViewById(R.id.list_desc);
        imageView= (ImageView) itemView.findViewById(R.id.list_avatar);
    }



}
