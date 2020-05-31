package Ch10.Exercise;

public class ExceptionSilencer {
    public static void main(String[] args) {
        try{
            throw new Exception();
        } finally {
            // Using ‘return’ inside the finally block
            // will silence any thrown exception.
            return;
        }
    }
}
