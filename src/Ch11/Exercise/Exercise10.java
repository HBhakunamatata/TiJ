package Ch11.Exercise;

/*
Create a class with two methods, f( ) and g( ).
In g( ), throw an exception of a new type that you define.
In f( ), call g( ), catch its exception and, in the catch clause,
    throw a different exception (of a second type that you define).
Test your code in main( ).
 */

public class Exercise10 {
    static void g() throws OneException {
        throw new OneException("OneException");
    }

    static void f() throws TwoException {
        try {
            g();
        } catch (OneException e) {
            e.printStackTrace();
            throw new TwoException("TwoException");
        }
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (TwoException e) {
            e.printStackTrace();
        }
    }
}
