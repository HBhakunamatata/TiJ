package Ch21.Exercise;

import java.util.Optional;
import java.util.stream.Stream;

/**
 */
public class OptionalBasics {
    static String test (Optional<String> optString) {
        if (optString.isPresent()) {
            return optString.get();
        }
        else {
            return "Nothing inside";
        }
    }
    public static void main(String[] args) {
        System.out.println(
            test( Stream.of("hello").findFirst() )
        );

        System.out.println(
            test( Stream.<String>empty().findAny() )
        );
    }
}
