package patterns.creational.factorymethod.kwonkyu;

import patterns.creational.factorymethod.kwonkyu.cargo.Ship;
import patterns.creational.factorymethod.kwonkyu.cargo.Transport;

public class ShipLogistics extends Logistics {
    @Override
    public Transport produceCargo() {
        return new Ship();
    }
}
