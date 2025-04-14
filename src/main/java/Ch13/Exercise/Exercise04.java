package Ch13.Exercise;

/*
  Modify the previous exercise so that it uses instanceof
    to check the type before performing the downcast.
 */

public class Exercise04 {

    public static void main(String[] args) {
        Shape shape = new Rhomboid();
        if (shape instanceof Rhomboid) {
            ((Rhomboid)shape).draw();
        }
        if (shape instanceof Circle){
            ((Circle)shape).draw();
        }

    }

}
