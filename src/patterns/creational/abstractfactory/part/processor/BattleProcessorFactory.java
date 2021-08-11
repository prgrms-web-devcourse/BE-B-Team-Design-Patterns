package patterns.creational.abstractfactory.part.processor;

public class BattleProcessorFactory implements ProcessorFactory {
    @Override
    public Processor produceProcessor() {
        return new BasicProcessor(32, 64);
    }
}
