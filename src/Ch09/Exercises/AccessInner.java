package Ch09.Exercises;

// Determine whether an outer class has access to the private elements of
// its inner class.

public class AccessInner {
    class Inner {
        private int i = 0;
    }

    public static void main(String[] args) {
        AccessInner ai = new AccessInner();

        AccessInner.Inner inner = ai.new Inner();

        System.out.println(inner.i);
    }
}
