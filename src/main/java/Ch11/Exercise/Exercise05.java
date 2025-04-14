package Ch11.Exercise;

/*
Create your own resumption-like behavior using a while loop
that repeats until an exception is no longer thrown.
 */

public class Exercise05 {
    public static void main(String[] args) {
        int [] nums = new int[5];
        int index = 10;
        while (index > 0){
            try{
                nums[index--] = 1;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println( nums[index] );
    }
}
