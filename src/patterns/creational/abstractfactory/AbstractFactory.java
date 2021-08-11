package patterns.creational.abstractfactory;

import patterns.PatternTester;
import patterns.creational.abstractfactory.product.Droid;

public class AbstractFactory implements PatternTester {
    @Override
    public void test() {
        DroidFactory currentFactory = new BattleDroidFactory();
        Droid battleDroid = currentFactory.produce();
        battleDroid.showYourSelf();

        currentFactory = new HouseworkDroidFactory();
        Droid houseworkDroid = currentFactory.produce();
        houseworkDroid.showYourSelf();
    }
}
