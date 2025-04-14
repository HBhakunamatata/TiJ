package Ch11.Exercise;
/*
Write code to generate and catch an ArraylndexOutOfBoundsException.
 */

public class Exercise03 {
    public static void main(String[] args) {
        int [] nums = new int[5];
        try {
            nums[6] = 5;
        }catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace(System.err);
        }
    }
}
