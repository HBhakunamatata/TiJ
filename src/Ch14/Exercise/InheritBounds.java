package Ch14.Exercise;

import java.awt.*;

class HoldItem <T> {
    T item;

    public HoldItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

class Colored2 <T extends HasColor> extends HoldItem <T>{
    Colored2 (T item) {
        super(item);
    }

    public java.awt.Color color() {
        return item.getColor();
    }
}

class ColoredDimension2 <T extends Dimension & HasColor>
        extends Colored2 <T> {
    ColoredDimension2 (T item) {
        super(item);
    }

    public double width() {
        return item.getWidth();
    }

    public double height() {
        return item.getHeight();
    }
}

class Solid2 <T extends Dimension & HasColor & Weight>
        extends ColoredDimension2 <T> {
    Solid2(T item ) {
        super(item);
    }

    public int weight() {
        return item.weight();
    }
}


public class InheritBounds {

}
