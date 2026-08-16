package factory;

import formatter.Formatter;
import formatter.SimpleFormatter;
import logger.Logger;
import logger.ScreenLogger;
import notifier.Notifier;
import notifier.OptionalNotifier;

public class DevFactory implements LoggingFactory {

    public Logger createLogger() {
        return new ScreenLogger();
    }

    public Formatter createFormatter() {
        return new SimpleFormatter();
    }

    public Notifier createNotifier() {
        return new OptionalNotifier();
    }
}
