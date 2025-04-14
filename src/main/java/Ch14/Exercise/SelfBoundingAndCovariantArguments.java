package Ch14.Exercise;

interface SelfBoundSetter <T extends SelfBoundSetter<T>> {
    void set (T item);
}

interface Setter extends SelfBoundSetter<Setter> {

}

public class SelfBoundingAndCovariantArguments {

    void test (SelfBoundSetter ss, Setter s1, Setter s2 ) {
        s1.set(s2);
        // s1.set(ss);
        ss.set(s1);
    }
}
