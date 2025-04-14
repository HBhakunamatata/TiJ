package Ch14.Exercise;

/*
 * Create a Holder for each of the primitive wrapper types,
 * and show that autoboxing and autoboxing works for
 * the set() and get() methods of each instance.
 */

public class Exercise30 {
    static class Holder <T> {
        T value;

        public Holder() {
        }

        public Holder(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

    }

    public static void main(String[] args) {
        Holder <Integer> integerHolder = new Holder<>();
        integerHolder.setValue(10);
        System.out.println(integerHolder.getValue());
    }
}
