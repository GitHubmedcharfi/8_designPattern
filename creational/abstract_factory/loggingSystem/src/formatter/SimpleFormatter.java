package formatter;

public class SimpleFormatter implements Formatter {
    public String format(String message) {
        return "[DEV] " + message;
    }
}
