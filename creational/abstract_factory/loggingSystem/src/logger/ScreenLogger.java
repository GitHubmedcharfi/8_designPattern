package logger;

public class ScreenLogger implements Logger {
    public void log(String message) {
        System.out.println(message);
    }
}
