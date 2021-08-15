package patterns.structural.decorator.kwonkyu.notifier.factory;

import patterns.structural.decorator.kwonkyu.notifier.BasicNotifier;
import patterns.structural.decorator.kwonkyu.notifier.Notifier;
import patterns.structural.decorator.kwonkyu.notifier.feature.DatabaseLogger;
import patterns.structural.decorator.kwonkyu.notifier.feature.RealtimeManagerNotifier;

public class FullNotifierFactory implements NotifierFactory {
    @Override
    public Notifier build() {
        Notifier notifier = new BasicNotifier();
        Notifier dbLogger = new DatabaseLogger(notifier);
        return new RealtimeManagerNotifier(dbLogger);
    }
}
