package patterns.structural.adapter.kwonkyu;

public class OldbieAdapter implements NewInterface {
    OldInterface oldbie;

    public OldbieAdapter(OldInterface oldbie) {
        this.oldbie = oldbie;
    }

    @Override
    public void getNumber(double num) {
        oldbie.getNumber((int) num);
    }
}
