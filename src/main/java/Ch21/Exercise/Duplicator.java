package Ch21.Exercise;

import java.util.stream.Stream;

public class Duplicator {
    public static void main(String[] args) {
        Stream.generate(() -> "duplicator")
            .limit(3)
            .forEach(System.out::println);
    }
}
