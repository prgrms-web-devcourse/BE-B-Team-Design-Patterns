package patterns.creational.abstractfactory.kwonkyu.part.mobility;

public class HouseworkMobilityFactory implements MobilityFactory {
    @Override
    public Mobility produceMobility() {
        return new Legs(2, 5);
    }
}
