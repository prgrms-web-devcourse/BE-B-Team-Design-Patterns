package patterns.creational.abstractfactory.part.tool;

public class BattleToolFactory implements ToolFactory {
    @Override
    public Tool produceTool() {
        return new LethalWeapon();
    }
}
