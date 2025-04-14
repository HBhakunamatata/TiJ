package Ch11.Exercise;

/*
 * Add a second level of exception loss to LostMessage.
 * java so that the TwoException is itself replaced by a third exception.
 */

public class Exercise18 {
    static void f1() throws OneException {
        throw new OneException("OneException");
    }
    static void f2() throws TwoException {
        throw new TwoException("TwoException");
    }
    static void f3() throws ThreeExeception {
        throw new ThreeExeception();
    }

    public static void main(String [] args) {
        try {
            try {
                try {
                    f1();
                } finally {
                    f2();
                }
            } finally {
                f3();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
