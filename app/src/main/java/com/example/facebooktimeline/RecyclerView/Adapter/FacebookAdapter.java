package com.example.facebooktimeline.RecyclerView.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.facebooktimeline.R;
import com.example.facebooktimeline.RecyclerView.FacebookPost;

import java.util.ArrayList;

public class FacebookAdapter extends RecyclerView.Adapter<FacebookAdapter.facebookViewHolder> {
    private ArrayList<FacebookPost>posts;

    public FacebookAdapter(ArrayList<FacebookPost> posts) {
        this.posts=posts;
    }

    @NonNull
    @Override
    public facebookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Context context=parent.getContext();
        //LayoutInflater layoutInflater=LayoutInflater.from(context);
       // View view=layoutInflater.inflate(R.layout.facebook_timeline_activity,parent,false);
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.facebook_timeline_activity, parent, false);
        return new facebookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull facebookViewHolder holder, int position) {
        FacebookPost post = posts.get(position);
        holder.textView1.setText(post.getUserName());
        holder.hourTextView.setText(post.getTime());
        holder.textView2.setText(post.getPostText());
        holder.linkTextView.setText(post.getPostLink());
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    class facebookViewHolder extends RecyclerView.ViewHolder {
        View profile, yellowImage;
        TextView textView1,hourTextView,moreOptions,textView2,linkTextView;
        LinearLayout Like,Comment,Share;
        public facebookViewHolder(@NonNull View itemView) {
            super(itemView);
            profile=itemView.findViewById(R.id.profile_image);
            yellowImage=itemView.findViewById(R.id.yellow_image);
            textView1=itemView.findViewById(R.id.text_view);
            hourTextView=itemView.findViewById(R.id.hour_text_view);
            moreOptions=itemView.findViewById(R.id.more_options);
            textView2=itemView.findViewById(R.id.text2_view);
            linkTextView=itemView.findViewById(R.id.link_text_view);
            Like=itemView.findViewById(R.id.like_button);
            Comment=itemView.findViewById(R.id.comment_button);
            Share=itemView.findViewById(R.id.share_button);
        }
    }
}
