package Ch20.Exercise;

import java.util.function.Function;

public class CurryingAndPartial {
    // Uncurried
    static String uncurried (String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Curried
        Function<String, Function<String, String>>
            sum = a -> b -> a + b;

        System.out.println(uncurried("Hi ", "Ho"));

        Function<String, String> fun1 = sum.apply("Hi ");
        System.out.println(fun1.apply("Ho"));

        // Partial
        Function<String, String> fun2 = sum.apply("Hop ");
        System.out.println(fun2.apply("Hip"));
        System.out.println(fun2.apply("Oh"));

    }
}
