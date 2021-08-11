package patterns.creational.factorymethod.cargo;

public class Truck implements Transport {
    @Override
    public void transport() {
        System.out.println("Transported by truck!");
    }
}
