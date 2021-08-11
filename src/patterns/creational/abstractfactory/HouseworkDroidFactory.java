package patterns.creational.abstractfactory;

import patterns.creational.abstractfactory.part.mobility.HouseworkMobilityFactory;
import patterns.creational.abstractfactory.part.mobility.Mobility;
import patterns.creational.abstractfactory.part.processor.HouseworkProcessorFactory;
import patterns.creational.abstractfactory.part.processor.Processor;
import patterns.creational.abstractfactory.part.tool.HouseworkToolFactory;
import patterns.creational.abstractfactory.part.tool.Tool;
import patterns.creational.abstractfactory.product.Droid;

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
