package com.example.facebooktimeline.RecyclerView;

public class FacebookPost {
    private String userName;
    private String time;
    private String postText;

    public String getPostLink() {
        return postLink;
    }

    public void setPostLink(String postLink) {
        this.postLink = postLink;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private String postLink;

    public FacebookPost(String userName, String time, String postText, String postLink) {
        this.userName = userName;
        this.time = time;
        this.postText = postText;
        this.postLink = postLink;
    }
}
