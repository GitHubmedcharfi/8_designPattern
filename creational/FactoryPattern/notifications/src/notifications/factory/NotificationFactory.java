package notifications.factory;

import notifications.model.Notification;

public abstract class NotificationFactory {
    public abstract Notification createNotification();
}
