package Ch12.Exercise;

import static net.mindview.util.Print.*;

public class Immutable {
    public static String upcase (String s) {
        return s.toUpperCase();
    }
    public static void main(String[] args) {
        String s = "howdy";
        print(s);
        String ss = upcase(s);
        print(ss);
        print(s);
    }
}
