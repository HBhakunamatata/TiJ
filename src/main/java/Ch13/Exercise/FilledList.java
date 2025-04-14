package Ch13.Exercise;

import java.util.ArrayList;
import java.util.List;

class CountedInteger {
    private static long counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        return Long.toString(id);
    }
}

public class FilledList <T> {
    Class<T> type;
    FilledList(Class<T> type) {
        this.type = type;
    }
    public List<T> create(int size) {
        List<T> list = new ArrayList<>(size);
        try {
            for (int i = 0; i < size; i++) {
                list.add(type.newInstance());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }


    public static void main(String[] args) {
        Class<CountedInteger> cc = CountedInteger.class;
        FilledList filledList = new FilledList(cc);
        List<CountedInteger> list = filledList.create(10);
        System.out.println(list);
    }
}
