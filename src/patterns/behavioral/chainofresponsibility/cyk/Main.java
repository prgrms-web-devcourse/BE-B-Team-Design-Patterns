package patterns.behavioral.chainofresponsibility.cyk;

import patterns.behavioral.chainofresponsibility.cyk.concrete.LimitSupport;
import patterns.behavioral.chainofresponsibility.cyk.concrete.NoSupport;
import patterns.behavioral.chainofresponsibility.cyk.concrete.OddSupport;
import patterns.behavioral.chainofresponsibility.cyk.concrete.SpecialSupport;
import patterns.behavioral.chainofresponsibility.cyk.handler.Support;

public class Main {
    public static void main(String[] args) {
        Support alice = new NoSupport("Alice");
        Support bob = new LimitSupport("bob",100);
        Support charlie = new SpecialSupport("charlie",429);
        Support diana = new LimitSupport("diana",200);
        Support elmo = new OddSupport("elmo");
        Support fred = new LimitSupport("fred",300);

        // 사슬 형성
        alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);

        // 다양한 트러블 발생
        for (int i = 0; i < 500; i++) {
            alice.support(new Trouble(i));
        }


    }
}
