package Ch21.Exercise;

import java.util.stream.Stream;

public class StreamOf {

    public static void main(String[] args) {
        Stream.of(new Bubble[] {
            new Bubble(0),
            new Bubble(1),
            new Bubble(2)
        }).forEach(System.out::println);

        Stream.of("It's ", "a ", "wonderful ",
            "day ", "for ", "pie.")
            .forEach(System.out::print);

        System.out.println();

        Stream.of(3.14159, 2.467, 1.686)
            .forEach(System.out::println);


    }
}
