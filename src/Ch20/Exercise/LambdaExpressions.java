package Ch20.Exercise;

import static net.mindview.util.Print.*;

interface Description {
    String brief();
}

interface Body {
    String detailed(String head);
}

interface Multi {
    String twoArgs(String head, double d);
}

public class LambdaExpressions {

    static Body body = h -> h + " No Parens";

    static Body body1 = (h) -> h + " More Details";
    static Description desc = () -> "Short info";
    static Multi multi = (h, n) -> h + n;

    static Description moreLines = () -> {
        System.out.println("moreLines()");
        return "from moreLines";
    };

    public static void main(String[] args) {
        print(body.detailed("Oh!"));
        print(body1.detailed("Hi!"));
        print(desc.brief());
        print(multi.twoArgs("Pi ", 3.14159));
        print(moreLines.brief());
    }
}
