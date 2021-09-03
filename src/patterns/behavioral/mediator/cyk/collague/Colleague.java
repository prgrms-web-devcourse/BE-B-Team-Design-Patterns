package patterns.behavioral.mediator.cyk.collague;

import patterns.behavioral.mediator.cyk.mediator.Mediator;

public interface Colleague {
    public abstract void setMediator(Mediator mediator);


    public abstract void setColleagueEnabled(boolean enabled);
}
