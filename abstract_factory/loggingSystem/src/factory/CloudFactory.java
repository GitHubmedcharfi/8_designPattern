package factory;

import formatter.CloudFormatter;
import formatter.Formatter;
import logger.CloudLogger;
import logger.Logger;
import notifier.AlertSystem;
import notifier.Notifier;

public class CloudFactory implements LoggingFactory {

    public Logger createLogger() {
        return new CloudLogger();
    }

    public Formatter createFormatter() {
        return new CloudFormatter();
    }

    public Notifier createNotifier() {
        return new AlertSystem();
    }
}
