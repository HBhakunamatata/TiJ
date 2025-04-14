package Ch21.Exercise;

import java.util.Date;
import java.util.Random;

public class Randoms {
    public static void main(String[] args) {
        new Random(47)
            .ints(5, 20)
            .distinct()
            .limit(6)
            .sorted()
            .forEach(System.out::println);
    }
}
