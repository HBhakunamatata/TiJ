package Ch14.Exercise;

public class GenericMethods {

    public <T> void method (T item) {
        System.out.println(item.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods genericMethods = new GenericMethods();
        genericMethods.method(1);
        genericMethods.method("");
        genericMethods.method(1.0);
        genericMethods.method(1.0F);
        genericMethods.method('c');
        genericMethods.method(genericMethods);
    }
}
