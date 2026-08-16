package com.chat.subject;

import com.chat.observer.Notifiable;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    private String name;
    private List<Notifiable> subscribers = new ArrayList<>();

    public ChatRoom(String name) {
        this.name = name;
    }

    public void subscribe(Notifiable observer) {
        subscribers.add(observer);
    }

    public void unsubscribe(Notifiable observer) {
        subscribers.remove(observer);
    }

    public void postMessage(String message) {
        System.out.println("\n" + name + " posted: " + message);
        notifySubscribers(message);
    }

    private void notifySubscribers(String message) {
        subscribers.forEach(sub -> sub.update(name, message));
    }
}
