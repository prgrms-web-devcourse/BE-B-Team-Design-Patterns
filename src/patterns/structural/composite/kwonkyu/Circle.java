package patterns.structural.composite.kwonkyu;

public class Circle implements Graphic {
    private String name;
    private int posX;
    private int posY;

    public Circle(String name, int posX, int posY) {
        this.name = name;
        this.posX = posX;
        this.posY = posY;
    }

    @Override
    public void move(int x, int y) {
        posX += x;
        posY += y;
        System.out.printf("Moved circle %s %d to x, %d to y(Current position: %d, %d)%n", name, x, y, posX, posY);
    }

    @Override
    public void draw() {
        System.out.printf("Drew circle %s at %d, %d%n", name, posX, posY);
    }
}
