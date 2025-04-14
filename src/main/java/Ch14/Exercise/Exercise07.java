package Ch14.Exercise;

// Use composition instead of inheritance to adapt Fibonacci to make it Iterable.

import java.util.Iterator;

class IterableFibonacci02 implements Iterable <Integer> {

    private Fabonacci fabonacci = new Fabonacci();

    private int count = 0;

    public IterableFibonacci02 (int count) {
        this.count = count;
    }

    @Override
    public Iterator <Integer> iterator() {
        return new Iterator<Integer>() {
            int n = count;
            @Override
            public boolean hasNext() {
                return n > 0;
            }

            @Override
            public Integer next() {
                n--;
                return fabonacci.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}

public class Exercise07 {
    public static void main(String[] args) {
        for (Integer i : new IterableFibonacci02(16)
             ) {
            System.out.print(i + " ");
        }
    }
}
