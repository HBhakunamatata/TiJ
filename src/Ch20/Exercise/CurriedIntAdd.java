package Ch20.Exercise;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

public class CurriedIntAdd {
    public static void main(String[] args) {
        IntFunction<IntUnaryOperator>
            curriedIntAdd = a -> b -> a + b;
        IntUnaryOperator operator = curriedIntAdd.apply(4);
        System.out.println(operator.applyAsInt(5));
    }
}
