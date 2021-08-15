package patterns.creational.abstractfactory.kwonkyu.part.processor;

public class BasicProcessor extends Processor {
    public BasicProcessor(int core, int thread) {
        super(core, thread);
    }

    @Override
    public void process() {
        System.out.printf("Processing with %d cores and %d threads%n", core, thread);
    }
}
