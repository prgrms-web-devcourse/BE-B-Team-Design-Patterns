package patterns.creational.abstractfactory.kwonkyu;

import patterns.creational.abstractfactory.kwonkyu.part.mobility.BattleMobilityFactory;
import patterns.creational.abstractfactory.kwonkyu.part.mobility.Mobility;
import patterns.creational.abstractfactory.kwonkyu.part.processor.BattleProcessorFactory;
import patterns.creational.abstractfactory.kwonkyu.part.processor.Processor;
import patterns.creational.abstractfactory.kwonkyu.part.tool.BattleToolFactory;
import patterns.creational.abstractfactory.kwonkyu.part.tool.Tool;
import patterns.creational.abstractfactory.kwonkyu.product.Droid;

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
