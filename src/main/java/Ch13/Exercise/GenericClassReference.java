package Ch13.Exercise;

public class GenericClassReference {
    public static void main(String[] args) {

        Class cc1 = int.class;
        cc1 = double.class;  // legal

        Class <Integer> cc2 = int.class;
        // cc2 = double.class;  // illegal

        // Class<Number> genericNumberClass = int.class;

        Class <? extends Number> bound = int.class;
        bound = double.class;
        bound = Number.class;
    }
}
