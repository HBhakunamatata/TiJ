package Ch14.Exercise;

import java.util.ArrayList;
import java.util.List;

public class GenericsVarargs {

    public static <T> List<T> makeList(T ... args) {
        List<T> list = new ArrayList<>();
        for (T t : args ){
            list.add(t);
        }
        return list;
    }

    public static void main(String[] args) {
        List<String> ls = makeList("A", "B", "C");
        System.out.println(ls);

        ls = makeList("ABCDEFFHIJKLMNOPQRSTUVWXYZ".split(""));
        System.out.println(ls);
    }
}

// The makeList() method shown here produces the same functionality as
// the standard library’s java.util.Arrays.asList() method.
