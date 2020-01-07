package Ch04.Exercise;

/*
 * Write a method that takes a vararg String array. Verify that you can
pass either a comma-separated list of Strings or a String[] into this method.
 */

public class Exercise19 {

    static void getArray (String ... args) {
        for (String i : args
             ) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Exercise19.getArray("one", "two", "three");
        Exercise19.getArray(new String [] {"1", "2", "3"});
    }
}
