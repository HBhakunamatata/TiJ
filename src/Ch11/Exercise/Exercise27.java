package Ch11.Exercise;

/*
Modify Exercise 3 to convert the exception to a RuntimeException.
 */

public class Exercise27 {
    public static void main(String[] args) {
        int [] nums = new int[5];
        try {
            nums[6] = 5;
        }catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException("Array index out of Bound");
        }
    }
}
