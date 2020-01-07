package Ch04.Exercise;

/*
 * Create a class containing an uninitialized String reference.
 * Demonstrate that this reference is initialized to null.
 */

class Student {
    String name;
}

public class Exercise01 {
    public static void main(String[] args) {
        System.out.println(new Student().name);
    }
}
