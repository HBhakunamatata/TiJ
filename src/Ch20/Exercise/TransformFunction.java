package Ch20.Exercise;

import java.util.function.Function;

class I {
    @Override
    public String toString() {
        return "I";
    }
}

class O {
    @Override
    public String toString() {
        return "O";
    }
}

public class TransformFunction {

    static Function<I, O> transform (Function<I, O> iFunc) {
        return iFunc.andThen( (o) -> {
            System.out.println(o);
            return o;
        } );
    }

    public static void main(String[] args) {
        Function<I, O> hh = transform(
                (i) -> {
                    System.out.println(i);
                    return new O();
                }
        );

        hh.apply(new I());
    }
}
