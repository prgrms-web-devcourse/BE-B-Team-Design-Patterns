package patterns.creational.abstractfactory.kwonkyu.part.tool;

public class BattleToolFactory implements ToolFactory {
    @Override
    public Tool produceTool() {
        return new LethalWeapon();
    }
}
