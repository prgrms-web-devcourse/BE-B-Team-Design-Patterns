package patterns.structural.decorator.kwonkyu.notifier.factory;

import patterns.structural.decorator.kwonkyu.notifier.BasicNotifier;
import patterns.structural.decorator.kwonkyu.notifier.Notifier;
import patterns.structural.decorator.kwonkyu.notifier.feature.DatabaseLogger;

public class DatabaseLoggerNotifierFactory implements NotifierFactory {
    @Override
    public Notifier build() {
        Notifier notifier = new BasicNotifier();
        return new DatabaseLogger(notifier);
    }
}
