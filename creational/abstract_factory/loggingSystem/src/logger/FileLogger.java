package logger;

public class FileLogger implements Logger {
    public void log(String message) {
        System.out.println("File log: " + message);
    }
}
