package Ch13.Exercise;

/*
  Implement a rotate(Shape) method in Shapes.java,
  such that it checks to see if it is rotating a Circle
    (and, if so, doesn’t perform the operation).
 */

import java.util.Arrays;
import java.util.List;

public class Exercise05 {
    public static void rotate (Shape s) {
        Class c = s.getClass();

        // Notice the difference of == and equals()
        if ( c.getSimpleName().equals("Circle")) {
            System.out.println("Circle does not need to rotate");
            return;
        }
        System.out.println(c.getSimpleName() + " rotate()");
    }

    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
            new Circle(), new Square(), new Triangle()
        );
        for(Shape shape : shapeList)
            rotate(shape);
    }
}
