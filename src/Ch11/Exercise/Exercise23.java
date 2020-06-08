package Ch11.Exercise;

/*
Add a class with a dispose() method to the previous exercise.
Modify FailingConstructor so that the constructor creates
 one of these disposable objects as a member object,
 after which the constructor might throw an exception,
 after which it creates a second disposable member object.
Write code to properly guard against failure,
 and in main() verify that all possible failure situations are covered.
 */

public class Exercise23 {

    public static void dispose(FailConstructor fc) {
        System.out.println("Release a FailConstructor");
    }

    public static void main(String[] args) {
        try{
            FailConstructor fc1 = new FailConstructor(1);
            try {
                FailConstructor fc2 = new FailConstructor(3);
                try {
                    //
                } finally {
                    dispose(fc2);
                }
            } catch (ConstructionException e) {
                e.printStackTrace();
            } finally {
                dispose(fc1);
            }
        } catch ( ConstructionException e ) {
            e.printStackTrace();
        }
    }
}
