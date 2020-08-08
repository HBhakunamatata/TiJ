package Ch14.Exercise;

/*
 * Modify BasicGeneratorDemo.java to use the explicit form of creation
 * for the Generator (that is, use the explicit constructor instead of
 * the generic create() method).
 */

public class Exercise14 {
    public static void main(String[] args) {
        BasicGenerator generator = new BasicGenerator(CountedObject.class);
        for (int i = 0; i < 10; i++) {
            System.out.println(generator.next());
        }
    }
}
