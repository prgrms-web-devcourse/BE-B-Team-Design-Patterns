package patterns.creational.abstractfactory.kwonkyu;

import patterns.creational.abstractfactory.kwonkyu.part.mobility.HouseworkMobilityFactory;
import patterns.creational.abstractfactory.kwonkyu.part.mobility.Mobility;
import patterns.creational.abstractfactory.kwonkyu.part.processor.HouseworkProcessorFactory;
import patterns.creational.abstractfactory.kwonkyu.part.processor.Processor;
import patterns.creational.abstractfactory.kwonkyu.part.tool.HouseworkToolFactory;
import patterns.creational.abstractfactory.kwonkyu.part.tool.Tool;
import patterns.creational.abstractfactory.kwonkyu.product.Droid;

public class HouseworkDroidFactory implements DroidFactory{
    @Override
    public Droid produce() {
        Mobility mobility = new HouseworkMobilityFactory().produceMobility();
        Processor processor = new HouseworkProcessorFactory().produceProcessor();
        Tool tool = new HouseworkToolFactory().produceTool();

        Droid droid = new Droid(processor, tool, mobility);
        droid.registerName("HOUSEWORK DROID");
        return droid;
    }
}
