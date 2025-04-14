package Ch20.Exercise;

@FunctionalInterface
interface TriFunction <T, U, V, R> {
    R func(T t, U u, V v);
}

public class TriFunctionTest {

    static int f (int i, long l, double d) {
        return 99;
    }

    public static void main(String[] args) {
        TriFunction<Integer, Long, Double, Integer> triFunction;

        triFunction = TriFunctionTest::f;
        System.out.println( triFunction.func(10, 100L, 3.14) );

        triFunction = (a, b, c) -> 12;
        System.out.println(triFunction.func(10, 100L, 3.14));
    }
}
