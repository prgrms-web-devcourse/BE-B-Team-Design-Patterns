package patterns.creational.abstractfactory.part.tool;

public class LethalWeapon extends Tool {
    public LethalWeapon() {
        super("BATTLE", "Combat");
    }

    @Override
    public void work() {
        System.out.println("I downed some enemies!");
    }
}
