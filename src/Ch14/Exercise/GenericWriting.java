package Ch14.Exercise;

import java.util.ArrayList;
import java.util.List;

public class GenericWriting {

    static List <Apple> apples = new ArrayList<>();
    static List <Fruit> fruits = new ArrayList<>();

    static <T> void writeExact (List<T> list, T item) {
        list.add(item);
    }

    static void f1( ) {
        writeExact(apples, new Apple());
        writeExact(fruits, new Fruit());
        writeExact(fruits, new Apple());
        // writeExact(apples, new Fruit());
        Fruit fruit = fruits.get(1);
    }

    static <T> void writeWithWildcard(List <? super T> list, T item) {
        list.add(item);
    }

    static void f2() {
        writeWithWildcard(fruits, new Fruit());
        writeWithWildcard(fruits, new Apple());
    }

    public static void main(String[] args) {
        f1();
        f2();
    }


}
