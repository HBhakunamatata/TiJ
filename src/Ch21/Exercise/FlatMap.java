package Ch21.Exercise;

import java.util.stream.Stream;

/**
 */
public class FlatMap {
    public static void main(String[] args) {
        Stream.of(1, 2, 3)
            .flatMap(i -> Stream.of("Gonzo", "Kermit", "Beaker"))
            .forEach(System.out::println);
    }
}
