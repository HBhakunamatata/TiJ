package Ch15.Exercise;

/*
 * Write a method that takes two int arguments,
 * indicating the two sizes of a 2-D array.
 * The method should create and fill a 2-D array of
 * BerylliumSphere according to the size arguments.
 */

import java.util.Arrays;

public class Exercise06 {

    static BerylliumSphere [][] create(int x, int y) {
        BerylliumSphere [][] result = new BerylliumSphere[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                result[i][j] = new BerylliumSphere();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(create(2,3)));
    }
}
