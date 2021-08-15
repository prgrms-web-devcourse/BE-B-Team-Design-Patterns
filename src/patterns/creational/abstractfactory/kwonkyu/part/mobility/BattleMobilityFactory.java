package patterns.creational.abstractfactory.kwonkyu.part.mobility;

public class BattleMobilityFactory implements MobilityFactory {
    @Override
    public Mobility produceMobility() {
        return new Legs(4, 10);
    }
}
