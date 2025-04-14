package Ch09.Exercises;

public class Sequence {
    private int i;
    private int [] items;
    Sequence (int size) {
        items = new int [size];
    }
    public void add (int element) {
        if(i < items.length) {
            items[i++] = element;
        }
    }


    // Selector is a private class. the reference is provided by selector()
    private class SequenceSelector implements Selector{

        private int i;  // index is dependent

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public void next() {
            if(i < items.length){
                i++;
            }
        }

        @Override
        public Object current() {
            return items[i];
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {

        Sequence nums = new Sequence(10);
        for(int i = 0; i < 10; i++){
            nums.add(i);
        }

        Selector selector = nums.selector();

        while (!selector.end()){
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
