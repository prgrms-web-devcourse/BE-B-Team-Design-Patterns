package patterns.creational.abstractfactory.part.mobility;

public class Legs extends Mobility {
    public Legs(int legs, int speed) {
        super(legs, speed);
    }

    @Override
    public void move() {
        System.out.printf("Walking with %d legs with speed of %d%n", legs, speed);
    }
}
