package Ch14.Exercise;

import java.util.Iterator;

public class IterableFibonacci
    extends Fabonacci implements Iterable <Integer>{

    private int count = 0;

    public IterableFibonacci (int count) {
        this.count = count;
    }

    class FibonacciIterator implements Iterator <Integer> {

        private int n = count;

        @Override
        public boolean hasNext() {
            return n > 0;
        }

        @Override
        public Integer next() {
            n--;
            return IterableFibonacci.this.next();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }


    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator();
    }

    public static void main(String[] args) {
        for (int i : new IterableFibonacci(16) ) {
            System.out.print(i + " ");
        }
    }
}
