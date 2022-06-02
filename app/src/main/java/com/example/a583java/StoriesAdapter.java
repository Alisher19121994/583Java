package com.example.a583java;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class StoriesAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<Stories> storiesArrayList;
    Context context;

    public StoriesAdapter(ArrayList<Stories> storiesArrayList, Context context) {
        this.storiesArrayList = storiesArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.stories, parent, false);
        return new StoriesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Stories stories = storiesArrayList.get(position);
        if (holder instanceof StoriesViewHolder) {
            ((StoriesViewHolder) holder).profile.setImageResource(stories.profile);
            ((StoriesViewHolder) holder).fullname.setText(stories.fullname);
        }
    }

    @Override
    public int getItemCount() {
        return storiesArrayList.size();
    }

    public class StoriesViewHolder extends RecyclerView.ViewHolder {
        ShapeableImageView profile;
        TextView fullname;

        public StoriesViewHolder(@NonNull View itemView) {
            super(itemView);
            profile = itemView.findViewById(R.id.stories_image_id);
            fullname = itemView.findViewById(R.id.stories_fullname_id);
        }
    }
}
