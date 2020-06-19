package Ch13.Exercise;

/*
  Incorporate a new kind of interface into ToyTest.java and
    verify that it is detected and displayed properly.
 */

public class Exercise02 {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("Ch13.Exercise.FancyToy");
            System.out.println("The interfaces as followed:");
            for (Class face : c.getInterfaces()) {
                System.out.println(face.getSimpleName());
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Can not find Ch13.Exercise.FancyToy");
        }
    }
}
