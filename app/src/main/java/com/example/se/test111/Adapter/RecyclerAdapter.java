package com.example.se.test111.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.se.test111.R;

/**
 * Created by Se on 6/2/2016.
 */

/**
 * Created by kundan on 10/26/2015.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> implements View.OnClickListener {
    private final static int ITEM_KEY = -2222;
    private final static int ITEM_POS = -1111;
    String[] name = {"Androidwarriors", "Stackoverflow", "Developer Android", "AndroidHive",
            "Slidenerd", "TheNewBoston", "Truiton", "HmkCode", "JavaTpoint", "Javapeper"};
    Context context;
    LayoutInflater inflater;
    private OnItemClickListener<String> mItemClickListener;
    private int position;

    public RecyclerAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.new_item_activity, parent, false);

        RecyclerViewHolder viewHolder = new RecyclerViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.tv1.setText(name[position]);
        holder.imageView.setTag(holder);

        holder.mRoot.setTag(ITEM_KEY, name[position]);
        holder.mRoot.setTag(ITEM_POS, position);
        holder.mRoot.setOnClickListener(this);
    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    @Override
    public void onClick(View v) {
        if (mItemClickListener != null) {
            String item = (String) v.getTag(ITEM_KEY);
            int pos = (int) v.getTag(ITEM_POS);
            mItemClickListener.onItemClick(pos, item);
        }
    }


    public interface OnItemClickListener<T> {
        void onItemClick(int pos, T item);
    }

    public void setOnItemClickListener(OnItemClickListener<String> mItemClickListener) {
        this.mItemClickListener = mItemClickListener;
    }


}
