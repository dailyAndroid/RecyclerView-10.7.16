package com.example.hwhong.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    //must first specify its dependency in the gradle script for it to run

    String[] country = {"Taiwan", "South Korea", "USA", "Hong Kong", "Japan", "India", "Canada",
            "France", "Germany", "Britan"};
    String[] capital = {"Taipei", "Seoul", "Washington DC", "Hong Kong", "Tokyo", "New Delhi",
            "Toronto", "Paris", "Berlin", "London"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        adapter = new RecyclerAdapter(country, capital);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
    }
}
