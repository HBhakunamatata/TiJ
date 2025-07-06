package Ch10.Exercise.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @description:
 * @author: Mr.Han
 * @create: 2025-07-05 16:00
 */

public class SetOfString {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Yellow");
        set.add("Blue");
        set.add("Red");
        set.add("Green");
        set.add("Yellow");
        set.add("Blue");
        set.add("Red");
        set.add("Purple");
        System.out.println(set);
    }

}
