package patterns.creational.abstractfactory;

import patterns.creational.abstractfactory.part.mobility.BattleMobilityFactory;
import patterns.creational.abstractfactory.part.mobility.Mobility;
import patterns.creational.abstractfactory.part.processor.BattleProcessorFactory;
import patterns.creational.abstractfactory.part.processor.Processor;
import patterns.creational.abstractfactory.part.tool.BattleToolFactory;
import patterns.creational.abstractfactory.part.tool.Tool;
import patterns.creational.abstractfactory.product.Droid;

public class BattleDroidFactory implements DroidFactory {
    @Override
    public Droid produce() {
        Mobility mobility = new BattleMobilityFactory().produceMobility();
        Processor processor = new BattleProcessorFactory().produceProcessor();
        Tool tool = new BattleToolFactory().produceTool();

        Droid droid = new Droid(processor, tool, mobility);
        droid.registerName("BATTLE DROID");
        return droid;
    }
}
