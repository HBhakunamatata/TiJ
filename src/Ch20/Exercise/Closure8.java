package Ch20.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Closure8 {
    Supplier<List<Integer>> makeFun() {
        // final List<Integer> list
        List<Integer> list = new ArrayList<>();
        list.add(1);
        return () -> list;
    }

    public static void main(String[] args) {
        Closure8 c8 = new Closure8();
        List<Integer>
                list1 = c8.makeFun().get(),
                list2 = c8.makeFun().get();

        System.out.println(list1);
        System.out.println(list2);

        list1.add(11);
        list2.add(22);

        System.out.println(list1);
        System.out.println(list2);
    }

}
