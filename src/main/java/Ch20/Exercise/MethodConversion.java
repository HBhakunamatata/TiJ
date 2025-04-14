package Ch20.Exercise;

import java.util.function.BiConsumer;

class In1 {}

class In2 {}

public class MethodConversion {
    static void accept (In1 in1, In2 in2) {
        System.out.println("accept()");
    }

    static void inOtherName (In1 in1, In2 in2) {
        System.out.println("inOtherName() : The same arguments but another name");
    }

    public static void main(String[] args) {
        BiConsumer<In1, In2> biConsumer;

        biConsumer = MethodConversion::accept;

        biConsumer.accept(new In1(), new In2());

        biConsumer = MethodConversion::inOtherName;

        biConsumer.accept(new In1(), new In2());

    }
}
