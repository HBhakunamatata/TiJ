package Ch14.Exercise;

public class GenericArray02 <T> {
    private Object [] array;

    public GenericArray02 (int size) {
        array = new Object[size];
    }

    public void put (T item, int index) {
        array[index] = item;
    }

    @SuppressWarnings("unchecked")
    public T get (int index) {
        return (T) array[index];
    }

    @SuppressWarnings("unchecked")
    public T[] rep() {
        return (T []) array;
    }

    public static void main(String[] args) {
        GenericArray02 <Integer> genericArray02 = new GenericArray02<>(5);

        for (int i = 0; i < 5; i++) {
            genericArray02.put(i, i);
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(genericArray02.get(i) + " ");
        }

        try {
            Integer [] rep = genericArray02.rep();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
