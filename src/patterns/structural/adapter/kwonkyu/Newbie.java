package patterns.structural.adapter.kwonkyu;

public class Newbie implements NewInterface {
    @Override
    public void getNumber(double num) {
        System.out.printf("I'm Newbie. I get number %f!%n", num);
    }
}
