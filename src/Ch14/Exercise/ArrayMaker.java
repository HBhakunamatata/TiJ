package Ch14.Exercise;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMaker <T> {
    private Class<T> type;

    public ArrayMaker(Class<T> type) {
        this.type = type;
    }

    @SuppressWarnings(value = "unchecked")
    public T [] create (int size) {
        return (T[]) Array.newInstance(type, size);
    }

    public static void main(String[] args) {
        ArrayMaker <String> arrayMaker = new ArrayMaker<>(String.class);
        String[] strings = arrayMaker.create(5);
        System.out.println(Arrays.toString(strings));
    }
}
