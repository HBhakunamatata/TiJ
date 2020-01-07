package Ch04.Exercise;

/*
 * Create a class with a constructor that takes a String argument. During
construction, print the argument. Create an array of object references to this class, but don’t
actually create objects to assign into the array. When you run the program, notice whether
the initialization messages from the constructor calls are printed.
 */

public class Exercise17 {
    String [] strings;
    Exercise17(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        Exercise17 e = new Exercise17("Uninitialized array in a new object : ");
        for (int i = 0; i < e.strings.length; i++) {
            System.out.println(e.strings[i]);
        }
    }
}
