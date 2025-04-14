package Ch11.Exercise;

/*
Write a class with a method that throws an exception
    of the type created in Exercise 4.
Try compiling it without an exception specification
    to see what the compiler says.
Add the appropriate exception specification.
Try out your class and its exception inside a try-catch clause.
 */

public class Exercise08 {
    public static void f() throws MyException02 {
        System.out.println("Throwing a MyException02 in f()");
        throw new MyException02();
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException02 myException02) {
            myException02.printStackTrace();
        }
    }
}
