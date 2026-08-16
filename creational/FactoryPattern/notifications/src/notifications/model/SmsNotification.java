package notifications.model;

public class SmsNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println(" Sending an SMS Notification...");
    }
}