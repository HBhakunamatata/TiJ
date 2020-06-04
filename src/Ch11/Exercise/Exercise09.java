package Ch11.Exercise;

/*
  Create three new types of exceptions.
  Write a class with a method that throws all three.
  In main( ), call the method but only use a single catch clause
    that will catch all three types of exceptions.
 */

class ExceptionAInExercise09 extends Exception { }
class ExceptionBInExercise09 extends Exception { }
class ExceptionCInExercise09 extends Exception { }

public class Exercise09 {

    static void f() throws ExceptionAInExercise09,
            ExceptionBInExercise09, ExceptionCInExercise09 {
    }

    public static void main(String[] args) {
        try{
            f();
        } catch (Exception e) {
            e.fillInStackTrace();
        }
    }
}
