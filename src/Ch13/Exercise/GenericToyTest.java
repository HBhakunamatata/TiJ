package Ch13.Exercise;

public class GenericToyTest {
    public static void main(String[] args) throws Exception {
        Class<FancyToy> cc1 = FancyToy.class;

        FancyToy ft = cc1.newInstance();

        Class<? super FancyToy> cc2 = cc1.getSuperclass();
        // Class<Toy> cc3 = cc1.getSuperclass();

        Object obj = cc2.newInstance();
    }
}
