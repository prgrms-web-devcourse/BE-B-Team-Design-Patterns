package patterns.structural.composite.kwonkyu;

import java.util.Arrays;
import java.util.List;

public class CompoundGraphic implements Graphic {
    private List<Graphic> graphics;

    public CompoundGraphic(Graphic... graphics) {
        this.graphics = Arrays.asList(graphics);
    }

    @Override
    public void move(int x, int y) {
        graphics.forEach(graphic -> graphic.move(x, y));
    }

    @Override
    public void draw() {
        graphics.forEach(Graphic::draw);
    }
}
