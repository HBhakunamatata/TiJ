package Ch12.Exercise;

import static net.mindview.util.Print.*;

public class IntegerMatch {
    public static void main(String[] args) {
        print("-1234".matches("-?\\d+"));
        print("5678".matches("-?\\d+"));
        print("+9211".matches("-?\\d+"));
        print("+9211".matches("-|\\+?\\d+"));
    }
}
