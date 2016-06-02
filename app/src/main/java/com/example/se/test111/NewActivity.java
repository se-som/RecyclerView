package com.example.se.test111;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.se.test111.Adapter.RecyclerAdapter;

/**
 * Created by Se on 6/2/2016.
 */
public class NewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity);
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        RecyclerAdapter adapter = new RecyclerAdapter(getBaseContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);

        //Layout manager for Recycler view

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter.setOnItemClickListener(new RecyclerAdapter.OnItemClickListener<String>() {
            @Override
            public void onItemClick(int pos, String item) {
                Toast.makeText(getBaseContext(), "pos=" +pos+", item=" +item, Toast.LENGTH_LONG).show();
            }
        });
    }

}
