package Ch14.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericReading {

    static List<Apple> apples = Arrays.asList(new Apple());
    static List<Fruit> fruits = Arrays.asList(new Fruit());

    static <T> T readExact (List<T> list) {
        return list.get(0);
    }

    static void f1() {
        Apple apple = readExact(apples);
        Fruit fruit = readExact(fruits);
        Fruit f = readExact(apples);
    }

    static class Reader <T> {
        T readExact (List <T> list) {
            return list.get(0);
        }
    }

    static void f2() {
        Reader<Fruit> fruitReader = new Reader<Fruit>();
        Fruit f = fruitReader.readExact(fruits);
        // Fruit a = fruitReader.readExact(apples); // Error:
        // readExact(List<Fruit>) cannot be
        // applied to (List<Apple>).
    }

    static class CovariantReader <T> {
        T readCovariant (List<? extends T> list) {
            return list.get(0);
        }
    }

    static void f3() {
        CovariantReader <Fruit> covariantReader = new CovariantReader<>();
        Fruit fruit1 = covariantReader.readCovariant(fruits);
        Fruit fruit = covariantReader.readCovariant(apples);
    }

    public static void main(String[] args) {
        f1();
        f2();
        f3();
    }



}
