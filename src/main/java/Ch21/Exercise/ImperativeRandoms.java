package Ch21.Exercise;

import java.util.HashSet;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class ImperativeRandoms {
    public static void main(String[] args) {
        int limit = 7;
        int bound = 20;

        Random rand = new Random(47);
        SortedSet<Integer> intSortedSet
            = new TreeSet<>();

        while (intSortedSet.size() < limit) {
            int temp = rand.nextInt(bound);
            if (temp < 5)
                continue;
            intSortedSet.add(temp);
        }
        // intSortedSet.stream().forEach(System.out::println);
        System.out.println(intSortedSet);
    }
}
