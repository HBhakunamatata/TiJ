package Ch14.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomList <T> {
    List<T> storage = new ArrayList<>();
    Random random = new Random();

    public void add(T item) {
        storage.add(item);
    }

    public T select () {
        int index = random.nextInt(storage.size());
        return storage.get(index);
    }

    public static void main(String[] args) {
        RandomList <String> stringRandomList = new RandomList<>();
        for (String s : ("The quick brown fox jumped over " +
                            "the lazy brown dog").split(" ")
             ) {
            stringRandomList.add(s);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(
                    stringRandomList.select() + " "
            );
        }
    }
}
