package patterns.creational.factorymethod.kwonkyu;

import patterns.creational.factorymethod.kwonkyu.cargo.Transport;
import patterns.creational.factorymethod.kwonkyu.cargo.Truck;

public class TruckLogistics extends Logistics {
    @Override
    public Transport produceCargo() {
        return new Truck();
    }
}
