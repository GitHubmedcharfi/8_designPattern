package factory;

import formatter.Formatter;
import logger.Logger;
import notifier.Notifier;

public interface LoggingFactory {
    Logger createLogger();
    Formatter createFormatter();
    Notifier createNotifier();
}
