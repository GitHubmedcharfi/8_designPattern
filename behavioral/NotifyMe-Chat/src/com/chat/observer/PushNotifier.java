package com.chat.observer;

public class PushNotifier implements Notifiable {
    private String deviceId;

    public PushNotifier(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public void update(String chatRoom, String message) {
        System.out.println("[Push to device " + deviceId + "] New message in " + chatRoom + ": " + message);
    }
}
