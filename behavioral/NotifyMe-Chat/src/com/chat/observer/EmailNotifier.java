package com.chat.observer;

public class EmailNotifier implements Notifiable {
    private String email;

    public EmailNotifier(String email) {
        this.email = email;
    }

    @Override
    public void update(String chatRoom, String message) {
        System.out.println("[Email to " + email + "] " + message);
    }
}
