package Ch21.Exercise;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 */
public class StreamOfRandoms {
    private static Random rand = new Random();
    public static void main(String[] args) {

        Stream.of(1, 2, 3, 4, 5)
            // Because rand.ints() produces an IntStream
            // we must use special Integer version of
            // flatMap(), concat() and of().
            .flatMapToInt(i -> IntStream.concat(
                rand.ints(0, 100).limit(i), IntStream.of(-1)
            ))
            .forEach(n -> System.out.format("%d ", n));
    }
}
