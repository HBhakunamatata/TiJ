package Ch14.Exercise;

/*
 * Overload the fill() method so that the arguments and return types
 * are the specific subtypes of Collection: List, Queue and Set.
 * This way, you don’t lose the type of container.
 * Can you overload to distinguish between List and LinkedList?
 */

import Ch14.Exercise.coffee.Coffee;
import Ch14.Exercise.coffee.CoffeeGenerator;
import net.mindview.util.Generator;

import java.util.LinkedList;
import java.util.List;

public class Exercise13 {

    public static <T> List<T> fill(List<T> list, Generator<T> gen, int size) {
        System.out.println("List");
        for (int i = 0; i < size; i++) {
            list.add(gen.next());
        }
        return list;
    }
    public static <T> LinkedList<T> fill(LinkedList<T> list, Generator<T> gen, int size) {
        System.out.println("LinkedList");
        for (int i = 0; i < size; i++) {
            list.add(gen.next());
        }
        return list;
    }

    public static void main(String[] args) {
        LinkedList <Coffee> list  = new LinkedList<>();
        Generator <Coffee> generator = new CoffeeGenerator();
        list = Exercise13.fill(list, generator, 10);
        System.out.println(list);
    }

}
