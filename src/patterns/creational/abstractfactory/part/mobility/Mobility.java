package patterns.creational.abstractfactory.part.mobility;

public abstract class Mobility {
    protected int legs;
    protected int speed;

    public Mobility(int legs, int speed) {
        this.legs = legs;
        this.speed = speed;
    }

    public int getLegs() {
        return legs;
    }

    public int getSpeed() {
        return speed;
    }

    public abstract void move();
}
