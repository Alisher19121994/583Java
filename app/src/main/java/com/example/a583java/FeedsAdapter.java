package com.example.a583java;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class FeedsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<Feeds> feedsArrayList;
    Context context;

    public FeedsAdapter(ArrayList<Feeds> feedsArrayList, Context context) {
        this.feedsArrayList = feedsArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.feeds, parent, false);
        return new FeedsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Feeds feeds = feedsArrayList.get(position);
        if (holder instanceof FeedsViewHolder) {
            ((FeedsViewHolder) holder).profile.setImageResource(feeds.profile);
            ((FeedsViewHolder) holder).video.setVideoURI(Uri.parse("android.resource://" + context.getPackageName() + "/" + feeds.postsPhoto));
            ((FeedsViewHolder) holder).video.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ((FeedsViewHolder) holder).video.start();
                }
            });
            ((FeedsViewHolder) holder).fullname.setText(feeds.fullname);
            ((FeedsViewHolder) holder).ids.setText(feeds.ids);
        }
    }

    @Override
    public int getItemCount() {
        return feedsArrayList.size();
    }

    public class FeedsViewHolder extends RecyclerView.ViewHolder {
        ShapeableImageView profile;
        VideoView video;
        TextView fullname;
        TextView ids;

        public FeedsViewHolder(@NonNull View itemView) {
            super(itemView);
            profile = itemView.findViewById(R.id.feeds_profile_image_id);
            video = itemView.findViewById(R.id.feeds_posts_video_id);
            fullname = itemView.findViewById(R.id.feeds_fullname_id);
            ids = itemView.findViewById(R.id.feeds_ids_id);

        }
    }
}
