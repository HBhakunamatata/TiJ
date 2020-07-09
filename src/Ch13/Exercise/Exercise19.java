package Ch13.Exercise;

/*
  In ToyTest.java, use reflection to create a Toy object using the non-default constructor.
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Exercise19 {
    public static void main(String[] args) {
        try {
            Class<?> cc = Class.forName(args[0]);
            Constructor<?> [] constructors = cc.getConstructors();
            for (Constructor<?> c : constructors) {
                if (c.getParameterCount() == 1) {
                    if (c.getParameterTypes()[0] == int.class) {
                        Object obj = c.newInstance(args[1]);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
