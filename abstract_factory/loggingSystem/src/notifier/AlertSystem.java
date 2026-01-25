package notifier;

public class AlertSystem implements Notifier {

    @Override
    public void notify(String message) {
        System.out.println("🚨 ALERT SYSTEM: " + message);
    }
}
