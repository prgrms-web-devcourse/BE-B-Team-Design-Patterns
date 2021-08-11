package patterns.structural.decorator.notifier.factory;

import patterns.structural.decorator.notifier.BasicNotifier;
import patterns.structural.decorator.notifier.Notifier;
import patterns.structural.decorator.notifier.feature.RealtimeManagerNotifier;

public class ManagerAlertNotifierFactory implements NotifierFactory {

    @Override
    public Notifier build() {
        Notifier notifier = new BasicNotifier();
        return new RealtimeManagerNotifier(notifier);
    }
}
