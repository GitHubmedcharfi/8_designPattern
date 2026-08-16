package notifier;

public class OptionalFileNotifier implements Notifier {

    @Override
    public void notify(String message) {
        System.out.println("PROD notification recorded: " + message);
    }
}
