package Ch13.Exercise;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

import static net.mindview.util.Print.print;


/*
    Command Lines : java Ch13.Exercise.ShowMethods ShowMethods
                    java Ch13.Exercise.ShowMethods java.lang.String
                    java Ch13.Exercise.ShowMethods int/char/String
 */

public class ShowMethods {
    private static String regex = "\\w+\\.";
    private static Pattern p = Pattern.compile(regex);

    public static void main(String[] args) {
        int lines = 0;
        try {
            Class<?> c = Class.forName(args[0]);
            if (args.length == 1) {
                for ( Method m : c.getMethods() ) {
                    // Test the format of methods name
                    // print(m);
                    print (p.matcher(m.toString()).replaceAll(""));
                }
                for (Constructor constructor : c.getConstructors()) {
                    print(p.matcher(constructor.toString()).replaceAll(""));
                }
                lines = c.getMethods().length + c.getConstructors().length;
            }
            else {
                for ( Method m : c.getMethods() ) {
                    // Test the format of methods name
                    // print(m);
                    if (m.toString().contains(args[1])) {
                        print (p.matcher(m.toString()).replaceAll(""));
                        lines++;
                    }

                }
                for (Constructor constructor : c.getConstructors()) {
                    if (constructor.toString().contains(args[1])){
                        print(p.matcher(constructor.toString()).replaceAll(""));
                        lines++;
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("No such class : " + args[0]);
        }
    }
}
