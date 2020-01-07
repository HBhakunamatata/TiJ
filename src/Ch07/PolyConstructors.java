package Ch07;

import static net.mindview.util.Print.*;
class Glyph {
    static {
        System.out.println("based class static initializer");
    }

    {
        System.out.println("based class member initializer");
    }
    void draw() { print("Glyph.draw()"); }
    Glyph() {
        print("Glyph() before draw()");
        draw();
        print("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    static {
        System.out.println("derived class static initializer");
    }

    {
        System.out.println("derived class member initializer");
    }
 private int radius = 1;
    {
        radius = 2;
        System.out.println("radius = " + radius);
    }
    RoundGlyph(int r) {
        radius = r;
        print("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    void draw() {
        print("RoundGlyph.draw(), radius = " + radius);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}

// initialization order checking
// pay attention to the overridden methods and member initializer
