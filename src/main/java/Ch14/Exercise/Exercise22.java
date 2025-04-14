package Ch14.Exercise;

/*
 * Use a type tag along with reflection to create a method
 * that uses the argument version of newInstance()
 * to create an object of a class with a constructor that has arguments.
 */

import java.lang.reflect.*;

class HCreator<T> {
	Class<T> kind;
	public HCreator(Class<T> kind) {
		this.kind = kind;
	}
	public T createNew(String typename) {

        Constructor<T> constructor = null;
        try {
            constructor = kind.getConstructor(typename.getClass());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            return (T)constructor.newInstance(typename);
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}

public class Exercise22 {
	public static void main(String[] args) {
		HCreator<Float> c = new HCreator<>(Float.class);
		System.out.println(c.createNew("128.2"));
	}
}


