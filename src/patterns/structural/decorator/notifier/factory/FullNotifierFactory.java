package patterns.structural.decorator.notifier.factory;

import patterns.structural.decorator.notifier.BasicNotifier;
import patterns.structural.decorator.notifier.Notifier;
import patterns.structural.decorator.notifier.feature.DatabaseLogger;
import patterns.structural.decorator.notifier.feature.RealtimeManagerNotifier;

public class FullNotifierFactory implements NotifierFactory {
    @Override
    public Notifier build() {
        Notifier notifier = new BasicNotifier();
        Notifier dbLogger = new DatabaseLogger(notifier);
        return new RealtimeManagerNotifier(dbLogger);
    }
}
