package Ch11.Exercise;
/*
Define an object reference and initialize it to null.
Try to call a method through this reference.
Now wrap the code in a try-catch clause to catch the exception.
 */

public class Exercise02 {
    public static void main(String[] args) {
        try{
            String s = null;
            s.toCharArray();
        }catch (Exception e){
            e.printStackTrace(System.out);
        }
    }
}
