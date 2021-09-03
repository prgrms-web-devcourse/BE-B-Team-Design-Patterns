package patterns.creational.factorymethod.cyk;


import patterns.creational.factorymethod.cyk.framework.Factory;
import patterns.creational.factorymethod.cyk.framework.Product;
import patterns.creational.factorymethod.cyk.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product idCard1 = factory.create("Zlatan");
        Product idCard2 = factory.create("Son");
        Product idCard3 = factory.create("Messi");
        idCard1.use();
        idCard2.use();
        idCard3.use();
    }
}
