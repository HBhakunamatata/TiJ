package Ch12.Exercise;

/*
  Split the string Splitting.knights on the words "the" or “you."
 */

import java.util.Arrays;

public class Exercise08 {
    static String s = Splitting.knights;

    public static void main(String[] args) {
        System.out.println(s);
        System.out.println(
                Arrays.toString(s.split("the|you")));
    }
}
