package notifications.factory;

import notifications.model.EmailNotification;
import notifications.model.Notification;

public class EmailFactory extends NotificationFactory {

    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}