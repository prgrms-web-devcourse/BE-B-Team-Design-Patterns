package patterns.creational.abstractfactory.kwonkyu.part.tool;

public abstract class Tool {
    String toolType;
    String toolWork;

    public Tool(String toolType, String toolWork) {
        this.toolType = toolType;
        this.toolWork = toolWork;
    }

    public String getToolType() {
        return toolType;
    }

    public String getToolWork() {
        return toolWork;
    }

    public abstract void work();
}
