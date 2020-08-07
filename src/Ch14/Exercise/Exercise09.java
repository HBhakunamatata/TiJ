package Ch14.Exercise;

/*
  Modify GenericMethods.java so that f() accepts three arguments,
  all of which are of a different parameterized type.
 */

public class Exercise09 {

    public <K, V, C> void genericMethod (K k, V v, C c) {
        System.out.print(
                k.getClass().getSimpleName() + " " +
                v.getClass().getSimpleName() + " " +
                c.getClass().getSimpleName() + " "
        );
    }

    public static void main(String[] args) {
        Exercise09 exercise = new Exercise09();
        exercise.genericMethod(1, 1.1, "");
    }
}
