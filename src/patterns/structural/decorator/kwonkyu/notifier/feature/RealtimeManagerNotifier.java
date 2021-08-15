package patterns.structural.decorator.kwonkyu.notifier.feature;

import patterns.structural.decorator.kwonkyu.notifier.Notifier;

public class RealtimeManagerNotifier extends NotifierFeaturer {
    public RealtimeManagerNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        System.out.printf("Message [ %s ] sent to manager.%n", message);
        notifier.send(message);
    }
}
