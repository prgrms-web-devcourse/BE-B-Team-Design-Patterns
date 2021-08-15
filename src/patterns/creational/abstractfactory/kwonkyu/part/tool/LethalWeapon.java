package patterns.creational.abstractfactory.kwonkyu.part.tool;

public class LethalWeapon extends Tool {
    public LethalWeapon() {
        super("BATTLE", "Combat");
    }

    @Override
    public void work() {
        System.out.println("I downed some enemies!");
    }
}
