package Ch11.Exercise;

// How an exception can be lost.

public class LostException {
    static void f1() throws OneException {
        throw new OneException("OneException");
    }
    static void f2() throws TwoException {
        throw new TwoException("TwoException");
    }

    public static void main(String [] args) {
        try {
            try {
                f1();
            } finally {
                f2();
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
