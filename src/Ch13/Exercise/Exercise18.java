package Ch13.Exercise;

/*
  Make ShowMethods a non-public class and verify that the
  synthesized default constructor no longer shows up in the output.
 */

import java.lang.reflect.Constructor;
import java.util.regex.Pattern;
import static net.mindview.util.Print.print;

class NonStatic {

}

public class Exercise18 {
    private static Pattern p = Pattern.compile("\\w+\\.|final\\s|native\\s");
    public static void main(String[] args) {
        try {
            Class cc = Class.forName("Ch13.Exercise.NonStatic");
            Constructor[] constructors = cc.getConstructors();

            for (Constructor ctor : constructors) {
                print(p.matcher(ctor.toString()).replaceAll(""));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
