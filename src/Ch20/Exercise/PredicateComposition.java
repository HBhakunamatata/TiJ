package Ch20.Exercise;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateComposition {
    static Predicate<String>
        f1 = (s) -> s.contains("bar"),
        f2 = (s) -> s.length() < 5,
        f3 = (s) -> s.contains("foo"),
        f4 = f1.negate().and(f2).or(f3);

    public static void main(String[] args) {
        Stream.of("bar", "foobar", "foobaz", "fjoenwiie")
                .filter(f4)
                .forEach(System.out::println);
    }
}
