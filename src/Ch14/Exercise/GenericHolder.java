package Ch14.Exercise;

public class GenericHolder <T> {
    private T field;

    public T get() {
        return field;
    }

    public void set(T field) {
        this.field = field;
    }

    public static void main(String[] args) {
        GenericHolder<String> holder = new GenericHolder<>();
        holder.set("Hello");
        String s = holder.get();
        System.out.println(s);
    }

    // javap -c GenericHolder
}
