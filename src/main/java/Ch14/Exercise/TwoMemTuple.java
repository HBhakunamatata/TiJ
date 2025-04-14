package Ch14.Exercise;

public class TwoMemTuple <K, V> {
    // 1.final : cannot change members only to create a new tuple (safety)
    // 2.public : client cannot change them because of 1(final)
    //            which takes the role of getters
    public final Object first;
    public final Object second;
    public TwoMemTuple (Object first, Object second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "(" + first +
                ", " + second + ')';
    }
}
