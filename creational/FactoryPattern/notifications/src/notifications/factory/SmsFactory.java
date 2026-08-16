package notifications.factory;

import notifications.model.Notification;
import notifications.model.SmsNotification;

public class SmsFactory extends NotificationFactory {

    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }
}
