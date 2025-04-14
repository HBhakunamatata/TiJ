package Ch21.Exercise;

import java.util.Arrays;
import java.util.function.IntFunction;

public class Machine2 {
    public static void main(String[] args) {
        Arrays.stream(new IntFunction[]{
            (o) -> 1,
            (o) -> 2,
            (o) -> 3
        }).forEach(i -> System.out.println(i.apply(1)));
    }
}
