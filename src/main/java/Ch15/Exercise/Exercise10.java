package Ch15.Exercise;

/*
 * Modify ArrayOfGenerics.Java to use containers instead of arrays.
 * Show that you can eliminate the compile-time warnings.
 */

import java.util.*;

public class Exercise10 {
    public static void main(String[] args) {
        List <List <String>> arrayofArray = new ArrayList<>();
        arrayofArray.add(new ArrayList<String>());
        // arrayofArray.add(new ArrayList<Integer>());

    }
}
