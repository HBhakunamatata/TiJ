package Ch11.Exercise;

/*
    Repeat Exercise10, but inside the catch clause,
    wrap g( )’s exception in a RuntimeException.
 */

public class Exercise11 {
    static void g() throws OneException {
        throw new OneException("OneException");
    }

    static void f() {
        try {
            g();
        } catch (OneException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        f();
    }
}
