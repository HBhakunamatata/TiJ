package Ch14.Exercise;

import java.util.*;

public class CompilerIntelligence {

    public static void main(String[] args) {
        List <? extends Fruit> flist = Arrays.asList(new Apple());

        // flist.add(new Apple());  // still cannot

        Apple apple = (Apple) flist.get(0);
        System.out.println(apple);
        System.out.println(flist.contains(new Apple()));
    }
}
