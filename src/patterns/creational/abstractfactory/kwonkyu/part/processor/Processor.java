package patterns.creational.abstractfactory.kwonkyu.part.processor;

public abstract class Processor {
    protected int core;
    protected int thread;

    public Processor(int core, int thread) {
        this.core = core;
        this.thread = thread;
    }

    public int getCore() {
        return core;
    }

    public int getThread() {
        return thread;
    }

    public abstract void process();
}
