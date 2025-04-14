package Ch15.Exercise;

// Repeat Exercise06 for a 3-D array.

import java.util.Arrays;

public class Exercise07 {

    static BerylliumSphere [][][] create3D(int x, int y, int z) {
        BerylliumSphere [][][] result = new BerylliumSphere[x][y][z];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    result[i][j][k] = new BerylliumSphere();
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(create3D(2,3,2)));
    }
}
