package Ch14.Exercise;

/*
 * Verify that FixedSizeStack in GenericCast.java generates
 * exceptions if you try to go out of its bounds.
 * Does this mean that bounds-checking code is not required?
 */

public class Exercise32 {
    private static class FixedSizeStack<T> {
        private int index = 0;
        private Object[] storage;
        public FixedSizeStack(int size) {
            storage = new Object[size];
        }
        public void push(T item) { storage[index++] = item; }
        @SuppressWarnings("unchecked")
        public T pop() { return (T)storage[--index]; }
    }
    public static void main(String[] args) {
        int size = 10;
        FixedSizeStack<String> stack = new FixedSizeStack<String>(size);
        for (int i = 0; i < size*2; i++) {
            stack.push(new String("HelloWorld!")); // java.lang.ArrayIndexOutOfBoundsException
        }
    }
}