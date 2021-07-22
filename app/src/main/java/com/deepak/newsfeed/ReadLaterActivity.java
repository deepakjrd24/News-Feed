package com.deepak.newsfeed;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ReadLaterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_later);
        setTitle("Read Later");

        RecyclerView recyclerView = findViewById(R.id.readLaterRcView);
        recyclerView.setLayoutManager( new LinearLayoutManager(this));

        ReadLaterNewsCardAdapter adapter = new ReadLaterNewsCardAdapter(this );
        recyclerView.setAdapter(adapter);
    }
}

