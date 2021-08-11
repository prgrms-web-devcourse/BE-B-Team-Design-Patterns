package patterns.creational.abstractfactory.part.tool;

public class HouseworkToolFactory implements ToolFactory {
    @Override
    public Tool produceTool() {
        return new CookingPan();
    }
}
