package patterns.creational.factorymethod.kwonkyu.cargo;

public class Ship implements Transport {
    @Override
    public void transport() {
        System.out.println("Transported by ship!");
    }
}
