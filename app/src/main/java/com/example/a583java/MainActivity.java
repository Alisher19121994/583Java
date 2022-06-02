package com.example.a583java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerViewFeeds;
    RecyclerView recyclerViewStories;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {

        recyclerViewStories = findViewById(R.id.recyclerView_Stories_id);
        recyclerViewStories.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        getStoriesAdapter(dataOfStories());


        recyclerViewFeeds = findViewById(R.id.recyclerView_Feeds_id);
        recyclerViewFeeds.setLayoutManager(new GridLayoutManager(this, 1));

        getFeedsAdapter(dataOfFeeds());
    }

    private ArrayList<Feeds> dataOfFeeds() {
        ArrayList<Feeds> list = new ArrayList();
        list.add(new Feeds(R.drawable.rasm, "Alisher", R.raw.v1, "@alisher#123"));
        list.add(new Feeds(R.drawable.rasm, "Alisher", R.raw.v1, "@alisher#123"));
        list.add(new Feeds(R.drawable.rasm, "Alisher", R.raw.v1, "@alisher#123"));
        list.add(new Feeds(R.drawable.rasm, "Alisher", R.raw.v1, "@alisher#123"));
        list.add(new Feeds(R.drawable.rasm, "Alisher", R.raw.v1, "@alisher#123"));
        list.add(new Feeds(R.drawable.rasm, "Alisher", R.raw.v1, "@alisher#123"));
        list.add(new Feeds(R.drawable.rasm, "Alisher", R.raw.v1, "@alisher#123"));

        return list;
    }

    private void getFeedsAdapter(ArrayList<Feeds> feeds) {
        FeedsAdapter feedsAdapter = new FeedsAdapter(feeds, this);
        recyclerViewFeeds.setAdapter(feedsAdapter);
    }


    private void getStoriesAdapter(ArrayList<Stories> stories) {
        StoriesAdapter storiesAdapter = new StoriesAdapter(stories, this);
        recyclerViewStories.setAdapter(storiesAdapter);
    }

    private ArrayList<Stories> dataOfStories() {
        ArrayList<Stories> list = new ArrayList();
        list.add(new Stories(R.drawable.rasm, "Alisher"));
        list.add(new Stories(R.drawable.rasm1, "Alisher"));
        list.add(new Stories(R.drawable.rasm2, "Alisher"));
        list.add(new Stories(R.drawable.rasm, "Alisher"));
        list.add(new Stories(R.drawable.rasm1, "Alisher"));
        list.add(new Stories(R.drawable.rasm2, "Alisher"));
        list.add(new Stories(R.drawable.rasm, "Alisher"));
        list.add(new Stories(R.drawable.rasm1, "Alisher"));
        list.add(new Stories(R.drawable.rasm2, "Alisher"));
        list.add(new Stories(R.drawable.rasm, "Alisher"));
        list.add(new Stories(R.drawable.rasm1, "Alisher"));
        list.add(new Stories(R.drawable.rasm2, "Alisher"));
        list.add(new Stories(R.drawable.rasm, "Alisher"));
        list.add(new Stories(R.drawable.rasm1, "Alisher"));
        list.add(new Stories(R.drawable.rasm2, "Alisher"));
        return list;
    }
}