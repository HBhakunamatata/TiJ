package Ch14.Exercise;

class Generic <T> {}

public class ArrayOfGenericReference {

    static Generic <Integer> [] gia;   // No warning but instance cannot get real type!
    static final int SIZE = 100;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Compiles but produces ClassCastException at runtime:
        //! gia = (Generic<Integer>[])new Object[SIZE];
        // Runtime type is the raw (erased) type:
        gia = (Generic<Integer>[])new Generic[SIZE];
        System.out.println(gia.getClass().getSimpleName());
        gia[0] = new Generic<Integer>();
        //! gia[1] = new Object(); // Compile-time error
        // Discovers type mismatch at compile time:
        //! gia[2] = new Generic<Double>();
    }

}
