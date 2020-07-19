package Ch14.Exercise;

public class ThreeMemTuple <A, B ,C> extends TwoMemTuple <A, B> {
    public final Object third;

    public ThreeMemTuple(Object first, Object second, Object third) {
        super(first, second);
        this.third = third;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ", " + third + ')';
    }
}
