package Ch11.Exercise;

class OneException extends Exception {
    OneException(String s) {
        super(s);
    }
}
class TwoException extends Exception {
    TwoException(String s) {
        super(s);
    }
}

public class RethrowNew {
    static void f() throws OneException {
        throw new OneException("OneException throw from f()");
    }

    public static void main(String[] args) {
        try{
            try{
                f();
            } catch (OneException e){
                System.out.println("Caught from inner try, printStackTrace:");
                e.printStackTrace(System.out);
                throw new TwoException("throw form inner try");
            }
        } catch (TwoException e) {
            System.out.println("Caught from outer try, printStackTrace:");
            e.printStackTrace(System.out);
        }
    }
}
