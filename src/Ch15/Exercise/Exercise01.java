package Ch15.Exercise;

/*
 * Create a method that takes an array of BerylliumSphere as an argument.
 * Call the method, creating the argument dynamically.
 * Demonstrate that ordinary aggregate array initialization doesn’t
 * work in this case. Discover the only situations where ordinary
 * aggregate array initialization works, and where dynamic
 * aggregate initialization is redundant.
 */

import java.util.Arrays;

public class Exercise01 {

    static BerylliumSphere [] fillArray (BerylliumSphere [] balls) {
        return balls = new BerylliumSphere[] {
                new BerylliumSphere(),
                new BerylliumSphere(),
                new BerylliumSphere()
        };
    }

    public static void main(String[] args) {
        BerylliumSphere [] a = null;
        a = fillArray(a);
        System.out.println(Arrays.toString(a));
    }
}
