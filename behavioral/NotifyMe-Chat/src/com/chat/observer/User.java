package com.chat.observer;

public class User implements Notifiable {
    private String username;

    public User(String username) {
        this.username = username;
    }

    @Override
    public void update(String chatRoom, String message) {
        System.out.println("[" + username + "] New message in " + chatRoom + ": " + message);
    }
}
