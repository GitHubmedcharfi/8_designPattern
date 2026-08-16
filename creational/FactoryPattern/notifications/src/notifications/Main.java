package notifications;

import notifications.factory.EmailFactory;
import notifications.factory.NotificationFactory;
import notifications.factory.PushFactory;
import notifications.factory.SmsFactory;
import notifications.model.Notification;

public class Main {

    public static void main(String[] args) {

        NotificationFactory emailFactory = new EmailFactory();
        NotificationFactory smsFactory = new SmsFactory();
        NotificationFactory pushFactory = new PushFactory();

        Notification email = emailFactory.createNotification();
        email.notifyUser();

        Notification sms = smsFactory.createNotification();
        sms.notifyUser();

        Notification push = pushFactory.createNotification();
        push.notifyUser();
    }
}