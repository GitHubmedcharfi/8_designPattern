import com.chat.observer.EmailNotifier;
import com.chat.observer.PushNotifier;
import com.chat.observer.User;
import com.chat.subject.ChatRoom;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ChatRoom room = new ChatRoom("General");

        User alice = new User("Alice");
        User bob = new User("Bob");
        EmailNotifier email = new EmailNotifier("admin@example.com");
        PushNotifier push = new PushNotifier("device123");

        room.subscribe(alice);
        room.subscribe(bob);
        room.subscribe(email);
        room.subscribe(push);

        room.postMessage("Hello everyone!");
        room.postMessage("Observer pattern in action!");

        room.unsubscribe(bob);

        room.postMessage("Bob will not receive this message.");
    }
}