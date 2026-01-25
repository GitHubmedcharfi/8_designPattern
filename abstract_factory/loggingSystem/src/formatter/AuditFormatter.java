package formatter;

import java.time.LocalDateTime;

public class AuditFormatter implements Formatter {
    public String format(String message) {
        return "[PROD][" + LocalDateTime.now() + "] " + message;
    }
}
