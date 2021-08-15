package patterns.creational.abstractfactory.kwonkyu.part.tool;

public class CookingPan extends Tool {
    public CookingPan() {
        super("HOUSEWORK", "Cooking");
    }

    @Override
    public void work() {
        System.out.println("I cooked some food!");
    }
}
