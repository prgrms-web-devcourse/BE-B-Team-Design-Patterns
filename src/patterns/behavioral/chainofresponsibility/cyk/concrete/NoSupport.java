package patterns.behavioral.chainofresponsibility.cyk.concrete;


import patterns.behavioral.chainofresponsibility.cyk.Trouble;
import patterns.behavioral.chainofresponsibility.cyk.handler.Support;

public class NoSupport extends Support {

    public NoSupport(String name) {
        super(name);
    }

    // 이 클래스는 아무것도 처리하지 않는다.
    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
