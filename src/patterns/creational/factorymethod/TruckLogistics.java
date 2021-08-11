package patterns.creational.factorymethod;

import patterns.creational.factorymethod.cargo.Transport;
import patterns.creational.factorymethod.cargo.Truck;

public class TruckLogistics extends Logistics {
    @Override
    public Transport produceCargo() {
        return new Truck();
    }
}
