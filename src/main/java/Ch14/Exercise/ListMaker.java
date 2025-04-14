package Ch14.Exercise;

import java.util.*;

public class ListMaker <T> {
    private List <T> list;

    public ListMaker () {
        list = new ArrayList<T>();
    }

    public void fill (T type, int size) {
        for (int i = 0; i < size; i++) {
            list.add(type);
        }
    }


    public static void main(String[] args) {
        ListMaker<String> stringMaker = new ListMaker<>();
        stringMaker.fill("Hello", 5);
        System.out.println(stringMaker.list);
    }
}
