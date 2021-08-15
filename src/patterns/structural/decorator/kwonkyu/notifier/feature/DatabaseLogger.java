package patterns.structural.decorator.kwonkyu.notifier.feature;

import patterns.structural.decorator.kwonkyu.notifier.Notifier;

public class DatabaseLogger extends NotifierFeaturer {
    public DatabaseLogger(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        System.out.printf("Message [ %s ] logged to DB.%n", message);
        notifier.send(message);
    }
}
