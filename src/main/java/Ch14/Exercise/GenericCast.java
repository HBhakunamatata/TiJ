package Ch14.Exercise;

class FixedStack <T> {
    private int index = 0;
    private Object [] items;

    public FixedStack (int size) {
        items = new Object[size];
    }


    public void push (T item) {
        items[index++] = item;
    }

    @SuppressWarnings("unchecked")
    public T pop(){
        return (T) items[--index];
    }
}

public class GenericCast {
    public static final int SIZE = 10;

    public static void main(String[] args) {
        FixedStack<String> strings = new FixedStack<String>(SIZE);
        for(String s : "A B C D E F G H I J".split(" "))
            strings.push(s);
        for(int i = 0; i < SIZE; i++) {
            String s = strings.pop();
            System.out.print(s + " ");
        }
    }
}
