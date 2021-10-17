package Ch20.Exercise;

import java.util.function.IntSupplier;

public class Closure4 {
    IntSupplier makeFun(final int x) {
        final int i = 0;
        // Neither x++ or i++ will work
        return () -> x + i;
    }
}
