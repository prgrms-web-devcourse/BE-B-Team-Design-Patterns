package patterns.structural.decorator.notifier.feature;

import patterns.structural.decorator.notifier.Notifier;

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
