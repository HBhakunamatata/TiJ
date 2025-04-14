package Ch14.Exercise;

/*
 * Modify ClassTypeCapture.java by adding a Map<String,Class<?>>,
 * a method addType(String typename, Class<?> kind),
 * and a method createNew(String typename).
 * createNew() will either produce a new instance of the class
 * associated with its argument string, or produce an error message.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class Exercise21 <T> {

    private Map<String, Class<?>> map;

    public Exercise21 () {
        map = new HashMap<>();
    }

    public void addType(String typename, Class<?> field) {
        map.put(typename, field);
    }

    public boolean judge (Object obj) {
        Class c = obj.getClass();
        return map.values().contains(c);
    }

    public Object createNew (String typename) {
        Class c = map.get(typename);
        if (c == null)
            throw new NoSuchElementException();
        try {
            return c.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Exercise21 capture = new Exercise21();
        capture.addType("String", String.class);
        capture.addType("Integer", Integer.class);
        System.out.println("I can find type of \"Hello\": " + capture.judge(new String("Hello")));
        System.out.println("I can find type of \"100\": " + capture.judge(new Integer(100)));
        System.out.println("I can find type of \"19.999\": " + capture.judge(new Double(19.999)));

        capture.addType("Exercise21", Ch14.Exercise.Exercise21.class);
        System.out.println(capture.createNew("Exercise21"));
    }
}
