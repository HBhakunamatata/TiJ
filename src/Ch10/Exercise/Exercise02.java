package Ch10.Exercise;

// Modify SimpleCollection.java to use a Set for c.

import java.util.HashSet;
import java.util.Collection;

public class Exercise02 {
    public static void main(String[] args) {
        Collection<Integer> c = new HashSet<>();
        for (int i = 0; i < 10; i++){
            c.add(i);   // autoboxing
        }

        for (Integer i : c) {
            System.out.print(i + ", ");
        }
    }
}
