package Ch15.Exercise;

/*
 * Demonstrate that multidimensional arrays of non-primitive
 * types are automatically initialized to null.
 */

import java.util.Arrays;

public class Exercise05 {
    public static void main(String[] args) {
        Object [] [] objects = new Object[2][2];
        System.out.println(Arrays.deepToString(objects));
    }
}
