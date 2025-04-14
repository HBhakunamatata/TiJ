package Ch14.Exercise;

import Ch14.Exercise.coffee.Coffee;
import Ch14.Exercise.coffee.CoffeeGenerator;
import net.mindview.util.Generator;
import net.mindview.util.RandomGenerator;
import sun.nio.cs.Surrogate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Generators {

    public static <T> void fill
            (Collection<T> collection, Generator <T> gen, int count)
    {
        for (int i = 0; i < count; i++) {
            collection.add(gen.next());
        }
    }

    public static void main(String[] args) {
        Generator <Integer> gen01 = new Fabonacci();
        //Generator <Coffee> gen02 = new CoffeeGenerator();

        List<Integer> list = new ArrayList<>();

        Generators.fill(list, gen01, 10);

        System.out.println(list);
    }
}
