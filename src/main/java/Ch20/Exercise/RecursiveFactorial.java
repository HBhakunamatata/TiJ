package Ch20.Exercise;

import static net.mindview.util.Print.*;

public class RecursiveFactorial {

    static IntCall fact;

    public static void main(String[] args) {
        fact = (n) -> n == 0 ? 1 : fact.call(n - 1) * n;
        for (int i = 0; i <= 10; i++) {
            print(fact.call(i));
        }
    }
}
