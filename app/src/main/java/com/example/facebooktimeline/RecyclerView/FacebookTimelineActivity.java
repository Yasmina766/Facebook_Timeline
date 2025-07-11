package com.example.facebooktimeline.RecyclerView;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.facebooktimeline.R;
import com.example.facebooktimeline.RecyclerView.Adapter.FacebookAdapter;

import java.util.ArrayList;
import java.util.Random;

public class FacebookTimelineActivity extends AppCompatActivity {
    private FacebookAdapter adapter;
    RecyclerView FacebookRecyclerView;
    private ArrayList<FacebookPost>posts;
    private String[] names={"Ahmed","Mona","Mohamed","Anas","Khaled"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timeline_activity);
        setupRecyclerView();
    }

    private void setupRecyclerView() {
        FacebookRecyclerView=findViewById(R.id.post_recycler_view);
        createPostList();
        adapter=new FacebookAdapter(posts);
        FacebookRecyclerView.setAdapter(adapter);
    }

    private void createPostList() {
            posts = new ArrayList<>();
        Random random=new Random();
            for (int i=1;i<=20;i++) {
                posts.add(new FacebookPost(names[random.nextInt(names.length)]+i+"", i + " hrs ago", "This is a sample post number " + i + ".", "https://example.com/post/" + i));
            }
    }
}