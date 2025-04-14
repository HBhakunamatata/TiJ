package Ch14.Exercise;

public class Holder <T> {
    private T item;
    public Holder () {}
    public Holder (T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }

    public void set(T item) {
        this.item = item;
    }

    public boolean equals (Object obj) {
        return item.equals(obj);
    }

    public static void main(String[] args) {
        Holder<Apple> appleHolder = new Holder<>(new Apple());
        Apple apple = appleHolder.get();
        appleHolder.set(apple);

        //Holder <Fruit> fruit = new Holder <Apple> ();
        Holder <? extends Fruit> fruit = appleHolder;

        Fruit fruit1 = fruit.get();
        apple = (Apple) fruit.get();

        try {
            Orange c = (Orange) fruit.get(); // No Warning : return a Fruit
            // fruit.set(new Apple());
            // fruit.set(new Fruit());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
