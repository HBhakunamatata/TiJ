package Ch10.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class AddGroups {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        // add group
        c.addAll(Arrays.asList(1,2,3,4));

        // two ways to create collection
        Collection c1 = new ArrayList(Arrays.asList(1,2));
        Collection c2 = Arrays.asList(1,2,3);

        c1.add(3);

        // c2.add(3);  // runtime error

    }
}
