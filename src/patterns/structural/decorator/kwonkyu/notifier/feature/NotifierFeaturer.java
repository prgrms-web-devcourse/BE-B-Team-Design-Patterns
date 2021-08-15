package patterns.structural.decorator.kwonkyu.notifier.feature;

import patterns.structural.decorator.kwonkyu.notifier.Notifier;

public abstract class NotifierFeaturer implements Notifier {
    Notifier notifier;

    public NotifierFeaturer(Notifier notifier) {
        this.notifier = notifier;
    }
}
