package Ch21.Exercise;

/**
 *
 */
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static net.mindview.util.Print.*;

public class OptionalsFromEmptyStreams {
    public static void main(String[] args) {
        print(Stream.<String>empty().findAny());
        print(Stream.<String>empty().findFirst());
        print(Stream.<String>empty().max(String.CASE_INSENSITIVE_ORDER));
        print(Stream.<String>empty().min(String.CASE_INSENSITIVE_ORDER));
        print(Stream.<String>empty().reduce( (s1, s2) -> s1 + s2 ));
        print(IntStream.empty().average());
    }
}
