package Ch14.Exercise;

public class GenericArray <T> {
    private T [] items;
    //private int size;

    @SuppressWarnings("unchecked")
    public GenericArray (int size) {
        items = (T []) new Object [size];
    }

    public T get (int index) {
        return items[index];
    }

    public void put (T item, int index) {
        items[index] = item;
    }

    public T [] pre() {
        return items;
    }

    public static void main(String[] args) {
        GenericArray<Integer> genericArray = new GenericArray<>(5);
        Object [] per = genericArray.pre();
        System.out.println("=================================");
        try {
            Integer[] pre = genericArray.pre();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
