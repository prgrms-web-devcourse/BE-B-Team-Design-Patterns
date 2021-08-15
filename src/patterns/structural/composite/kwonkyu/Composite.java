package patterns.structural.composite.kwonkyu;

public class Composite {
    public static void test() {
        Graphic dot1 = new Dot("dot#1", 10, 10);
        Graphic dot2 = new Dot("dot#2", 150, 150);
        Graphic circle = new Circle("Circle#1", 0, 0);
        Graphic compound = new CompoundGraphic(dot1, dot2, circle);

        System.out.println("==== COMPOUND DRAW");
        compound.draw();
        System.out.println();

        System.out.println("==== MOVE GRAPHICS ONE BY ONE");
        dot1.move(90, 90);
        dot2.move(-50, -50);
        circle.move(100, 100);

        System.out.println("==== DRAW GRAPHICS ONE BY ONE");
        dot1.draw();
        dot2.draw();
        circle.draw();

        System.out.println("==== MOVE AND DRAW GRAPHICS COMPOUND");
        compound.move(-100, -100);
        compound.draw();
    }
}
