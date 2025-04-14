package Ch11.Exercise;

class MyException extends Exception {
    MyException () { }
    MyException (String s) { super(s); }
}

public class FullConstructors {
    public static void f() throws MyException {
        System.out.println("Throwing exception in f()");
        throw new MyException();
    }

    public static void g() throws MyException {
        System.out.println("Throwing exception in g()");
        throw new MyException("My exception in g()");
    }

    public static void main(String[] args) {
        try{
            f();
        }catch (MyException e){
            e.printStackTrace(System.out);
        }

        try{
            g();
        }catch (MyException e){
            e.printStackTrace(System.out);
        }
    }
}
