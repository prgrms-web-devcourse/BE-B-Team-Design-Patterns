package patterns.structural.adapter.kwonkyu;

public class Oldbie implements OldInterface {
    @Override
    public void getNumber(int num) {
        System.out.printf("I'm Oldbie. I get number %d!%n", num);
    }
}
