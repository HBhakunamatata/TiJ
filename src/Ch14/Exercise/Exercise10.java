package Ch14.Exercise;

/*
 * Modify the previous exercise so that one of f()’s arguments is non-parameterized.
 */

public class Exercise10 {

    public <K, V> void genericMethod (K k, String s, V v) {
        System.out.print(
                k.getClass().getSimpleName() +
                s +
                v.getClass().getSimpleName()
        );
    }

    public static void main(String[] args) {
        Exercise10 exercise = new Exercise10();
        exercise.genericMethod(1, " +++++ ", 1.1);
    }
}
