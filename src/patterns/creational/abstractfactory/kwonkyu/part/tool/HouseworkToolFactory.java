package patterns.creational.abstractfactory.kwonkyu.part.tool;

public class HouseworkToolFactory implements ToolFactory {
    @Override
    public Tool produceTool() {
        return new CookingPan();
    }
}
