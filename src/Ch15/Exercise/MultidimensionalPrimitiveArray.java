package Ch15.Exercise;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultidimensionalPrimitiveArray {

    public static void main(String[] args) {
        int [][] twoDArray = {
                {1, 2, 3},
                {4, 5, 6},
        };
        System.out.println(Arrays.deepToString(twoDArray));

        int [][][] threeDArray = new int [2][3][4];
        System.out.println(Arrays.deepToString(threeDArray));
    }
}
