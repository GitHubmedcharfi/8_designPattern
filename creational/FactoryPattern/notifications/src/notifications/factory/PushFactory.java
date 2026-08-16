package notifications.factory;

import notifications.model.Notification;
import notifications.model.PushNotification;

public class PushFactory extends NotificationFactory {

    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
