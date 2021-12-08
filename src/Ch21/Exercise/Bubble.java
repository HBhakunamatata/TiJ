package Ch21.Exercise;

public class Bubble {
    final int i;

    Bubble (int i) {
        this.i = i;
    }

    public static int count = 0;

    public static Bubble bubbler() {
        return new Bubble(count++);
    }

    @Override
    public String toString() {
        return "Bubble(" +
            "i=" + i + ')';
    }

}
