package patterns.creational.abstractfactory.kwonkyu;

import patterns.creational.abstractfactory.kwonkyu.product.Droid;

public class AbstractFactory {
    public void test() {
        DroidFactory currentFactory = new BattleDroidFactory();
        Droid battleDroid = currentFactory.produce();
        battleDroid.showYourSelf();

        currentFactory = new HouseworkDroidFactory();
        Droid houseworkDroid = currentFactory.produce();
        houseworkDroid.showYourSelf();
    }
}
