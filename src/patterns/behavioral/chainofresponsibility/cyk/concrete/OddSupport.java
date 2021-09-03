package patterns.behavioral.chainofresponsibility.cyk.concrete;


import patterns.behavioral.chainofresponsibility.cyk.Trouble;
import patterns.behavioral.chainofresponsibility.cyk.handler.Support;

public class OddSupport extends Support {

    public OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() % 2 == 1){
            return true;
        }else{
            return false;
        }
    }
}
