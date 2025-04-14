package Ch14.Exercise;

public class SimpleHolder {
    private Object object;

    public Object get() {
        return object;
    }

    public void set(Object object) {
        this.object = object;
    }

    public static void main(String[] args) {

        SimpleHolder holder = new SimpleHolder();
        holder.set("Hello");
        String s = (String) holder.get();
        System.out.println(s);

        // javap -c SimpleHolder
    }
}
