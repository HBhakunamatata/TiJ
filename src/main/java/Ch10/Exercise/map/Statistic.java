package Ch10.Exercise.map;

import java.util.HashMap;
import java.util.Random;

/**
 * @description:
 * @author: Mr.Han
 * @create: 2025-07-05 17:12
 */

public class Statistic {

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Random rand = new Random();
        for (int i = 0; i < 10000; i++) {
            int r = rand.nextInt(20);
            map.put(r, map.getOrDefault(r, 0) + 1);
        }
        System.out.println(map);
    }

}
