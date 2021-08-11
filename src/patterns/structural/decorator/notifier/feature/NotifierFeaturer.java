package patterns.structural.decorator.notifier.feature;

import patterns.structural.decorator.notifier.Notifier;

public abstract class NotifierFeaturer implements Notifier {
    Notifier notifier;

    public NotifierFeaturer(Notifier notifier) {
        this.notifier = notifier;
    }
}
