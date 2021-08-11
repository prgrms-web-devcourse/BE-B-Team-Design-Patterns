package patterns.creational.abstractfactory.product;

import patterns.creational.abstractfactory.part.mobility.Mobility;
import patterns.creational.abstractfactory.part.processor.Processor;
import patterns.creational.abstractfactory.part.tool.Tool;

public class Droid {
    private Processor processor;
    private Tool tool;
    private Mobility mobility;

    private String name;
    public void registerName(String name) { this.name = name; }

    public Droid(Processor processor, Tool tool, Mobility mobility) {
        this.processor = processor;
        this.tool = tool;
        this.mobility = mobility;
    }

    public void showYourSelf() {
        System.out.printf("My name is %s.%n", name);
        System.out.printf("I have %d core and %d threads.%n", processor.getCore(), processor.getThread());
        System.out.printf("I have %d legs and can move with %d speeds.%n", mobility.getLegs(), mobility.getSpeed());
        System.out.printf("My tool is for %s. I can do some %s.%n", tool.getToolType(), tool.getToolWork());
        System.out.println(" ---- S H O W T I M E ----");
        processor.process();
        mobility.move();
        tool.work();
    }
}
