package patterns.behavioral.chainofresponsibility.cyk.concrete;


import patterns.behavioral.chainofresponsibility.cyk.Trouble;
import patterns.behavioral.chainofresponsibility.cyk.handler.Support;

public class LimitSupport extends Support {

    private int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() < limit) {
            return true;
        } else {
            return false;
        }
    }
}
