package Ch10.Exercise.set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @description:
 * @author: Mr.Han
 * @create: 2025-07-05 15:58
 */

public class SetOfInteger {

    public static void main(String[] args) {
        Random rand = new Random();
        Set<Integer> intset = new HashSet<>();
        for (int i = 0; i < 1000; i++) {
            intset.add(rand.nextInt(30));
        }
        System.out.println(intset);
    }

}
