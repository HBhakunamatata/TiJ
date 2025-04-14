package Ch14.Exercise;

import java.lang.reflect.Array;

public class GenericArray03 <T> {
    private Class <T> type;

    private T [] array;

    @SuppressWarnings("unchecked")
    public GenericArray03 (Class<T> type, int size) {
        this.type = type;
        array = (T[]) Array.newInstance(type, size);
    }

    public void put(int index, T item) {
        array[index] = item;
    }

    public T get(int index) {
        return array[index];
    }

    public T [] rep() {
        return array;
    }

    public static void main(String[] args) {
        GenericArray03 <Integer> genericArray03 =
                new GenericArray03 <> (Integer.class, 5);
        Integer[] rep = genericArray03.rep();
    }
}
