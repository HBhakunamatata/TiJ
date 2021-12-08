package Ch21.Exercise;

import java.util.Random;
import java.util.stream.Stream;

public class RandomGenerators {
    public static <T> void show (Stream<T> stream) {
        stream.limit(4)
            .forEach(System.out::println);
        System.out.println("++++++++++++++++");
    }

    public static void main(String[] args) {
        Random rand = new Random(47);

        show(rand.ints().boxed());
        show(rand.longs().boxed());
        show(rand.doubles().boxed());
        // show(rand.floats().boxed()); No use floats()

        show(rand.ints(30, 70).boxed());
        show(rand.longs(2342, 5245).boxed());
        show(rand.doubles(0.1, 0.4).boxed());

        show(rand.ints(3, 30, 70).boxed());
        show(rand.longs(3, 2342, 5245).boxed());
        show(rand.doubles(3, 0.1, 0.4).boxed());

    }
}
