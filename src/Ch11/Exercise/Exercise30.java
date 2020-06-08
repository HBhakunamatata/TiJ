package Ch11.Exercise;

/*
  Modify Human.java so that the exceptions inherit from RuntimeException.
  Modify main() so that the technique in TurnOffChecking.java is used to
    handle the different types of exceptions.
 */

public class Exercise30 {
    static void throwRuntimeExceptions(int index) {
        try {
            switch (index) {
                case 1:
                    throw new Sneeze();
                case 2:
                    throw new Annoyance();
                default:
                    throw new RuntimeException();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        try {
            for (int i = 1; i < 4; i++) {
                throwRuntimeExceptions(i);
            }
        } catch (RuntimeException re) {
            try {
                throw re.getCause();
            } catch (Sneeze s) {
                System.out.println("Caught a Sneeze");
            } catch (Annoyance s) {
                System.out.println("Caught a Annoyance");
            } catch (RuntimeException s) {
                System.out.println("Caught a RuntimeException");
            } catch (Throwable e) {
                System.out.println("Caught a Throwable");
            }
        }

    }
}
