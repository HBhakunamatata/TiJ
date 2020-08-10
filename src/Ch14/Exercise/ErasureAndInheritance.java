package Ch14.Exercise;

class GenericBase <T> {
    private T obj;

    public T get() {
        return obj;
    }

    public void set(T obj) {
        this.obj = obj;
    }
}

class Derived01 <T> extends GenericBase <T> {}

class Derived02 extends GenericBase {}  // No Warning

 // class Derived03 extends GenericBase<?> {}

public class ErasureAndInheritance {

    @SuppressWarnings(value = "unchecked")
    public static void main(String[] args) {
        Derived02 derived02 = new Derived02();
        Object obj = derived02.get();
        derived02.set(obj); // Warning here!
    }

}
