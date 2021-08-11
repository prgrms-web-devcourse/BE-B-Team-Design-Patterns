package patterns.creational.factorymethod;

import patterns.creational.factorymethod.cargo.Ship;
import patterns.creational.factorymethod.cargo.Transport;

public class ShipLogistics extends Logistics {
    @Override
    public Transport produceCargo() {
        return new Ship();
    }
}
