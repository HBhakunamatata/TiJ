package Ch13.Exercise;

/*
 Add Rhomboid to Shapes.java.
 Create a Rhomboid, upcast it to a Shape, then downcast it back to a Rhomboid.
 Try downcasting to a Circle and see what happens.
 */

class Rhomboid extends Shape {

    @Override
    public String toString() {
        return "Rhomboid";
    }
}

public class Exercise03 {
    public static void main(String[] args) {
        Shape shape = new Rhomboid();
        ((Rhomboid)shape).draw();

        try {
            ((Circle)shape).draw();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
