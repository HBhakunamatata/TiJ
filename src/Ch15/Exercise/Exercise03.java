package Ch15.Exercise;

/*
* Write a method that creates and initializes a twodimensional array of double.
* The size of the array is determined by the arguments of the method,
* and the initialization values are a range determined by beginning
* and ending values that are also arguments of the method.
* Create a second method that will print the array generated
* by the first method. In main() test the methods by creating and
* printing several different sizes of arrays.
 */

import java.util.Arrays;
import java.util.Random;

public class Exercise03 {

    static Random random = new Random();
    static double [][] create2Double (int raw, int col, int start, int end) {
        double [][] result = new double [raw][col];
        for (int i = 0; i < raw; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = start + Math.abs(end - start) * random.nextDouble();
            }
        }
        return result;
    }

    static void show2DoubleArray(double [][] array) {
        System.out.println( Arrays.deepToString(array) );
    }

    public static void main(String[] args) {
        show2DoubleArray(create2Double(3,4,12,23));
    }
}
