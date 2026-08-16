import notifier.AlertSystem;
import notifier.Notifier;
import notifier.OptionalFileNotifier;
import notifier.OptionalNotifier;

public class Main {
    public static void main(String[] args) {

        Notifier devNotifier = new OptionalNotifier();
        Notifier prodNotifier = new OptionalFileNotifier();
        Notifier cloudNotifier = new AlertSystem();

        System.out.println("Sending DEV notification:");
        devNotifier.notify("This is a DEV message.");

        System.out.println("\nSending PROD notification:");
        prodNotifier.notify("This is a PROD message.");

        System.out.println("\nSending CLOUD notification:");
        cloudNotifier.notify("This is a CLOUD alert!");

        //TIP Press <shortcut actionId="Debug"/> to start debugging your code.
        // You can set breakpoints by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        for (int i = 1; i <= 3; i++) {
            System.out.println("Test iteration i = " + i);
        }
    }
}
