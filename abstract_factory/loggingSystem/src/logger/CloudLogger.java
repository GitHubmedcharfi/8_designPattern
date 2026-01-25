package logger;

public class CloudLogger implements Logger {
    public void log(String message) {
        System.out.println("Cloud log: " + message);
    }
}
