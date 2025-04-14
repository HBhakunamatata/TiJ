package Ch20.Exercise;

import static net.mindview.util.Print.*;

public class RecursiveFibonacci {
    static IntCall fib;

    public static void main(String[] args) {
        fib = (n) -> n == 1 ? 1 :
                     n == 2 ? 1 :
                     fib.call(n - 2) + fib.call(n - 1);


        for (int i = 1; i <= 10; i++) {
            print(fib.call(i));
        }
    }
}
