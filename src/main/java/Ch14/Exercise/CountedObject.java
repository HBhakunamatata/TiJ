package Ch14.Exercise;

public class CountedObject {

    private static int counter = 0;
    private final int id  = counter++;

    public CountedObject () { }

    public int id() {
        return id;
    }

    @Override
    public String toString() {
        return "CountedObject " + id;
    }
}
