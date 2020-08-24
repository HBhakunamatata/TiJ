package Ch14.Exercise;

interface GenericGetter <T extends GenericGetter<T>> {
    T get();
}

interface Getter extends GenericGetter <Getter> {

}

public class GenericsAndReturnTypes {

    void test (Getter gg) {
        GenericGetter gg1 = gg.get();
        Getter g2 = gg.get();
    }
}
