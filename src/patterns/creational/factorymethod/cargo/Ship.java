package patterns.creational.factorymethod.cargo;

public class Ship implements Transport {
    @Override
    public void transport() {
        System.out.println("Transported by ship!");
    }
}
