package Ch14.Exercise;

public class BasicHolder <T> {

    private T item;

    public BasicHolder () { }

    public BasicHolder (T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }

    public void set(T item) {
        this.item = item;
    }

    void f() {
        System.out.println(item.getClass().getSimpleName());
    }
}
