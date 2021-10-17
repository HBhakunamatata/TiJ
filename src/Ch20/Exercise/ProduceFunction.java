package Ch20.Exercise;

import java.util.function.Function;

interface FuncSS extends Function<String, String> {

}

public class ProduceFunction {
    static FuncSS produce() {
        return x -> x.toLowerCase();
    }

    public static void main(String[] args) {
        FuncSS funcSS = produce();
        System.out.println(
                funcSS.apply("YELLING!") );
    }
}
