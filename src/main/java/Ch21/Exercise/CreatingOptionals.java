package Ch21.Exercise;

import java.util.Optional;

/**
 */
public class CreatingOptionals {
    static void
    test(String testName, Optional<String> opt) {
        System.out.println(" === " + testName + " === ");
        System.out.println(opt.orElse("Null"));
    }

    public static void main(String[] args) {
        test("empty", Optional.empty());
        test("of", Optional.of("Howdy"));

        try {
            test("of", Optional.of(null));
        } catch (Exception e) {
            System.out.println(e);
        }

        test("ofNullable", Optional.ofNullable("Hi"));
        test("ofNullable", Optional.ofNullable(null));

    }
}
