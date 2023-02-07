package com.kiran.urlHitCounter.Model;

public class User {
    String username;
    int hitCount;

    public User(String username, int hitCount) {
        this.username = username;
        this.hitCount = hitCount;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getHitCount() {
        return hitCount;
    }

    public void setHitCount(int hitCount) {
        this.hitCount = hitCount;
    }
}
