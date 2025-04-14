package Ch14.Exercise;

// "Generify" innerclasses/Sequence.java.

import Ch14.Exercise.Selector;

class Sequence <T> {
    private Object [] items;
    private int i;
    Sequence (int size) {
        items = new Object[size];
    }

    public void add (T item) {
        if (i < items.length) {
            items[i++] = item;
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    private class GenericsSelector<T> implements Selector<T> {
        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public void next() {
            if (i < items.length) {
                i++;
            }
        }

        @Override
        public T current() {
            return (T) items[i++];
        }
    }

    public Selector<T> getSelector() {
        return new GenericsSelector();
    }
}

public class Exercise04 {

    public static void main(String[] args) {
        Sequence<Integer> ss = new Sequence<>(10);
        Selector<Integer> selector = ss.getSelector();

        for (int i = 0; i < 10; i++) {
            ss.add(i);
        }

        while (selector.end()) {
            Integer integer = selector.current();
            System.out.println(selector.current());
            selector.next();
        }
    }

}
