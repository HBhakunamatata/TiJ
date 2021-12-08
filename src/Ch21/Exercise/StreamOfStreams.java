package Ch21.Exercise;

import java.util.stream.Stream;

/**
 */

public class StreamOfStreams {
    public static void main(String[] args) {
        Stream.of(1, 2, 3)   // Stream<Integer>
            .map(i -> Stream.of("Gonzo", "Kermit", "Beaker"))  // Stream<Stream<String>>
            .map(e -> e.getClass().getName())// Stream<String>
            .forEach(System.out::println);
    }
}
