package Ch14.Exercise;

/*
Show that covariance doesn’t work with Lists,
using Numbers and Integers, then introduce wildcards.
 */

import java.util.*;

public class Exercise27 {
    public static void main(String[] args) {
        // List<Number> nlist = new ArrayList<Float>();

        List<? extends Number> nlist = new ArrayList<Float>();
        // nlist.add(new Integer(2));
        // nlist.add(new Float(1.1));
        // Number number = nlist.get(0);  // No error
    }
}
