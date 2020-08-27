package Ch15.Exercise;

// Demonstrate the assertions in the previous paragraph.

public class Exercise08 {


    static class Holder <T> {
        T [] items;
        int size;
        int index = 0;

        @SuppressWarnings("unchecked")
        public Holder(int size) {
            items = (T []) new Object[10];
        }

        public T[] getArray() {
            // return new T [10];  // illegal
            return items;
        }

        public void insert (T item) {
            if (index <= size) {
                items[index++] = item;
            }
            else {
                throw new IndexOutOfBoundsException();
            }
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Holder <String> stringHolder = new Holder<>(10);
        stringHolder.insert("hello");
        Object [] a = stringHolder.getArray();
    }
}
