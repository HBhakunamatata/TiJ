package Ch10.Exercise.linkedlist;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @description:
 * @author: Mr.Han
 * @create: 2025-07-05 15:34
 */

public class Stack <T> {

    private Deque<T> storage = new ArrayDeque<T>();

    public void push(T t) {
        storage.push(t);
    }

    public T peek() {
        return storage.peek();
    }

    public T pop() {
        return storage.pop();
    }

    public boolean isEmpty() {
        return storage.isEmpty();
    }

    @Override
    public String toString() {
        return storage.toString();
    }

}
