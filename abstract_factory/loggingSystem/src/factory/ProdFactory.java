package factory;

import formatter.AuditFormatter;
import formatter.Formatter;
import logger.FileLogger;
import logger.Logger;
import notifier.Notifier;
import notifier.OptionalFileNotifier;

public class ProdFactory implements LoggingFactory {

    public Logger createLogger() {
        return new FileLogger();
    }

    public Formatter createFormatter() {
        return new AuditFormatter();
    }

    public Notifier createNotifier() {
        return new OptionalFileNotifier();
    }
}
