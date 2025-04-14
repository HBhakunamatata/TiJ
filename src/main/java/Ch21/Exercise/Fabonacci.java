package Ch21.Exercise;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Fabonacci {
    private int x = 1;
    public IntStream numbers() {
        return IntStream.iterate(
            0, i -> {
                int result = x + i;
                x = i;
                return result;
            }
        );
    }

    public static void main(String[] args) {
        new Fabonacci().numbers()
            .limit(10)
            .forEach(System.out::println);
    }
}
