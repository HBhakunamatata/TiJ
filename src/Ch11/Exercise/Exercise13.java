package Ch11.Exercise;

/*
 * Modify Exercise 9 by adding a finally clause.
 * Verify that your finally clause is executed,
 *   even if a NullPointerException is thrown.
 */

public class Exercise13 {
    static void f() throws ExceptionAInExercise09,
            ExceptionBInExercise09, ExceptionCInExercise09 {
    }

    public static void main(String[] args) {
        try{
            f();
        } catch (Exception e) {
            e.fillInStackTrace();
        } finally {
            System.out.println("Finally is always executed ...");
        }
    }
}
