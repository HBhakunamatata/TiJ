package Ch11.Exercise;

class SimpleException extends Exception { }

public class CreatingExceptions {

    public void f() throws SimpleException {
        System.out.println("Throwing simple exceptions ...");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        CreatingExceptions ce = new CreatingExceptions();
        try{
            ce.f();
        }catch (SimpleException e) {
            System.out.println("Catching a Exception");
        }
    }
}
