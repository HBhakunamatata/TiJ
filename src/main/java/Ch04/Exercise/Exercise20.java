package Ch04.Exercise;

/*
 * Create a main() that uses varargs instead of the ordinary main() syntax.
 * Print all the elements in the resulting args array.
 * Test it with various numbers of command-line arguments.
 */

public class Exercise20 {
    public static void main(String ... args) {
        for (String i : args
             ) {
            System.out.print(i + " ");
        }
    }
}
