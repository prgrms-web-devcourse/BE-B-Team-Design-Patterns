package patterns.structural.adapter;

public class Adapter {
    public void test() {
        NewInterface newbie = new Newbie();
        OldInterface oldbie = new Oldbie();
        NewInterface oldbieAdapted = new OldbieAdapter(oldbie);

        newbie.getNumber(100.123);
        oldbieAdapted.getNumber(100.123);
    }
}
