package com.chat.observer;

public interface Notifiable {
    void update(String chatRoom, String message);
}
