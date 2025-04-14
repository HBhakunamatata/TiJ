package Ch21.Exercise;

import java.util.stream.IntStream;

import static java.util.stream.IntStream.*;

public class Ranges {
    public static void main(String[] args) {

        // 1. tradition way
        int sum = 0;
        for (int i = 10; i < 20; i++) {
            sum += i;
        }

        // 2. for-in
        for (Integer i : range(10, 20).toArray()) {
            sum += i;
        }

        // 3. stream
        System.out.println(range(10, 20).sum());

    }
}
