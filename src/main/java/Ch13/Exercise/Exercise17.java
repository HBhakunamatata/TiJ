package Ch13.Exercise;

/*
  Modify the regular expression in ShowMethods.java to additionally
  strip off the keywords native and final (hint: use the OR operator’|’)
 */

import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static net.mindview.util.Print.print;

public class Exercise17 {
    private static Pattern p = Pattern.compile("\\w+\\.|final\\s|native\\s");

    public static void main(String[] args) {
        try {
            Class c = Class.forName(args[0]);
            Method [] methods = c.getMethods();

            if (args.length == 1) {
                for (Method m : methods) {
                    print( p.matcher(m.toString()).replaceAll("") );
                }
            }
            else {
                for (Method m : methods) {
                    if (m.toString().contains(args[1]))
                        print( p.matcher(m.toString()).replaceAll("") );
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
