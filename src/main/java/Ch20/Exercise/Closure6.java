package Ch20.Exercise;

import java.util.function.IntSupplier;

public class Closure6 {
    IntSupplier makeFun (int x) {
        int i = 0;
        i++;
        x++;

        final int iFinal = i;
        final int xFinal = x;

        return () -> iFinal + xFinal;
    }
}
