package Ch14.Exercise;

import net.mindview.util.Generator;

public class Fabonacci implements Generator <Integer> {

    private int count = 0;

    public Fabonacci () { }

    public int fib (int n) {
        if (n < 2) {
            return 1;
        }
        return fib(n-2) + fib(n-1);
    }

    @Override
    public Integer next() {
        return fib(count++);
    }

    public static void main(String[] args) {

        Fabonacci fabonacci = new Fabonacci();
        for (int i = 0; i < 16; i++) {
            System.out.print(fabonacci.next() + " ");
        }
    }
}
