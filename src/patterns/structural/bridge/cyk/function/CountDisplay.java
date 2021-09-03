package patterns.structural.bridge.cyk.function;


import patterns.structural.bridge.cyk.implement.DisplayImpl;

public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    // times회 반복해서 표시한다.
    public void multiDisplay(int times){
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
