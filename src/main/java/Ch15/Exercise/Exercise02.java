package Ch15.Exercise;

/*
 * Write a method that takes an int argument and returns an
 * array of that size, filled with BerylliumSphere objects.
 */

import java.util.Arrays;

public class Exercise02 {
    static BerylliumSphere [] fillBeryArray (int size) {
        BerylliumSphere [] result = new BerylliumSphere[size];

        for (int i = 0; i < size; i++) {
            result[i] = new BerylliumSphere();
        }

        return result;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(fillBeryArray(5)));
        }

    }
}
