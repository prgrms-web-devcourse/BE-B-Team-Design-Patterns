package patterns.creational.factorymethod.kwonkyu;

import patterns.creational.factorymethod.kwonkyu.cargo.Transport;

public class FactoryMethod {
    Logistics logistics;
    Transport transport;

    public void test() {
        logistics = new ShipLogistics();
        transport = logistics.produceCargo();
        transport.transport();

        logistics = new TruckLogistics();
        transport = logistics.produceCargo();
        transport.transport();
    }
}
