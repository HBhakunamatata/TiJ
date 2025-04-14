package Ch15.Exercise;

// Repeat the Exercise03 for a three-dimensional array.

import java.util.Arrays;
import java.util.Random;

public class Exercise04 {

    static Random random = new Random();
    static double [][][] create2Double (int raw, int col, int hei, int start, int end) {
        double [][][] result = new double [raw][col][hei];
        for (int i = 0; i < raw; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = 0; k < hei; k++) {
                    result[i][j][k] = start + Math.abs(end - start) * random.nextDouble();
                }
            }
        }
        return result;
    }

    static void show3DoubleArray(double [][][] array) {
        System.out.println( Arrays.deepToString(array) );
    }

    public static void main(String[] args) {
        show3DoubleArray(create2Double(3,4, 2,12,23));
    }

}
