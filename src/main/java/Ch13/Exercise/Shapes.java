package Ch13.Exercise;

import java.util.Arrays;
import java.util.List;

abstract class Shape {
    boolean isHighLighted = false;
    void draw() { System.out.println(this + ".draw() and it's " +
            (isHighLighted ? "highlighted" : "unhighlighted")); }
    abstract public String toString();
}

class Circle extends Shape {
    public String toString() { return "Circle"; }
}
class Square extends Shape {
    public String toString() { return "Square"; }
}
class Triangle extends Shape {
    public String toString() { return "Triangle"; }
}

public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
            new Circle(), new Square(), new Triangle()
        );
        for(Shape shape : shapeList)
            shape.draw();
    }
}
