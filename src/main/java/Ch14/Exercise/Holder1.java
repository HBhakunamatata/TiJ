package Ch14.Exercise;

class Automobile {}

public class Holder1 {
    private Automobile a;
    public Holder1 (Automobile automobile) {
        a = automobile;
    }

    public Automobile get() {
        return a;
    }
}
