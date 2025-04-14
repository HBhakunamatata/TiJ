package Ch12.Exercise;

/*
  Rewrite SplitDemo using String.split( ).
 */

import java.util.Arrays;

public class Exercise14 {

    static String input = "This!!unusual use!!of exclamation!!points";

    static void split(String regex) {
        System.out.println(
                Arrays.toString( input.split(regex) )
        );
    }
    static void splitPieces (String regex, int num) {
        System.out.println(
                Arrays.toString( input.split(regex, num) )
        );
    }
    public static void main(String[] args) {
        split("!!");
        splitPieces("!!", 3);
    }


}
