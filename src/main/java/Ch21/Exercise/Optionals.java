package Ch21.Exercise;

/**
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Optionals {
    static void ifPresent(Optional<String> optStr) {
        optStr.ifPresent(i -> System.out.println("There is something"));
    }

    static void orElse(Optional<String> optSrt) {
        System.out.println(optSrt.orElse("orElse : produce another object"));
    }

    static void orElseGet(Optional<String> optStr) {
        System.out.println(
            optStr.orElseGet(() -> new String("orElseGet : produce another String"))
        );
    }

    static void orElseThrow(Optional<String> optStr) {
        try {
            optStr.orElseThrow(() -> new Exception("Supplied"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void test (String testName,
                      Consumer<Optional<String>> cos) {
        System.out.println(" === " + testName + " === ");
        cos.accept(Stream.of("Epithets").findFirst());
        cos.accept(Stream.<String>empty().findAny());
    }

    public static void main(String[] args) {
        // test("basics", Optionals::basics);
        test("ifPresent", Optionals::ifPresent);
        test("orElse", Optionals::orElse);
        test("orElseGet", Optionals::orElseGet);
        test("orElseThrow", Optionals::orElseThrow);
    }
}
