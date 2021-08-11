package patterns.creational.factorymethod;

import patterns.PatternTester;
import patterns.creational.factorymethod.cargo.Transport;

public class FactoryMethod implements PatternTester {
    Logistics logistics;
    Transport transport;

    @Override
    public void test() {
        logistics = new ShipLogistics();
        transport = logistics.produceCargo();
        transport.transport();

        logistics = new TruckLogistics();
        transport = logistics.produceCargo();
        transport.transport();
    }
}
