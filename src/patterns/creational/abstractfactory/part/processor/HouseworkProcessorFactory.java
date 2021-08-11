package patterns.creational.abstractfactory.part.processor;

public class HouseworkProcessorFactory implements ProcessorFactory {
    @Override
    public Processor produceProcessor() {
        return new BasicProcessor(4, 8);
    }
}
