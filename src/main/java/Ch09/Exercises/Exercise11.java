package Ch09.Exercises;

/*
 * Create a private inner class that implements a public interface. Write
a method that returns a reference to an instance of the private inner class, upcast to the
interface. Show that the inner class is completely hidden by trying to downcast to it.
 */

interface InterfaceA{
    void fun();
}

public class Exercise11 {
    public InterfaceA getClassA() {
        class ClassA implements InterfaceA {
            @Override
            public void fun() {
                System.out.println("Calling fun() in ClassA");
            }
        }
        return new ClassA();
    }

    public static void main(String[] args) {
        Exercise11 exercise = new Exercise11();
        InterfaceA a = exercise.getClassA();
        // There will be an error when downcast as out of scope
        // ClassA a = exercise.getClassA();
    }
}
