package Ch09.Exercises;

public interface ClassInInterface {
    void howdy();

    // auto static
    class Test implements ClassInInterface {

        @Override
        public void howdy() {
            System.out.println("Test code in interface");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}

/*
 * It’s convenient to nest a class inside an interface when you want to create some common code
to be used with all different implementations of that interface.
 */