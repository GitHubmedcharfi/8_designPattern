package formatter;

public class CloudFormatter implements Formatter {
    public String format(String message) {
        return "{ \"cloud\": \"" + message + "\" }";
    }
}
