package Ch13.Exercise;

import java.lang.reflect.Method;
import java.util.regex.Pattern;

import static net.mindview.util.Print.print;

public class ShowMethods {
    private static String regex = "\\w+\\.";
    private static Pattern p = Pattern.compile(regex);

    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName(args[0]);
            for ( Method m : c.getMethods() ) {
                //print ( p.matcher(m.toString()).replaceAll("k") );
                //print(p.matcher(m.toString()).);
                print(m);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
