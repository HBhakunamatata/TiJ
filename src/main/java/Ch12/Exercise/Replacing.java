package Ch12.Exercise;

import static net.mindview.util.Print.*;

public class Replacing {
    static String s = Splitting.knights;

    public static void main(String[] args) {

        print(s.replaceFirst("f\\w+", "location"));
        print(s.replaceFirst("shrubbery|tree|herring","banana"));
    }
}
