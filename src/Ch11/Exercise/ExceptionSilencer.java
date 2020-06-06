package Ch11.Exercise;

public class ExceptionSilencer {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } finally {
            // Using return in finally block will silence any exception.
            return;
        }
    }
}
