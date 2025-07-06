package Ch10.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddGroups {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Integer [] otherNum = {6, 7, 8, 9};
        c.addAll(Arrays.asList(otherNum));

        Collections.addAll(c, 11, 12, 13, 14, 15);
        Collections.addAll(c, otherNum);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.set(1, 99);

        try {
            // report error
            list.add(100);
        } catch (Exception e) {
            if (e instanceof UnsupportedOperationException) {
                e.printStackTrace();
            }
        }

    }
}
