package Ch09.Exercises;

// Exercise 22: (2) Implement reverseSelector( ) in Sequence.java.

public class Sequence03 {
    private int i;
    private int [] items;
    Sequence03 (int size) {
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

    public Selector reverseSelector () {
        return new Selector() {
            private int i = items.length - 1;
            @Override
            public boolean end() {
                return i < 0;
            }

            @Override
            public void next() {
                if(i >= 0){
                    i--;
                }
            }

            @Override
            public Object current() {
                return items[i];
            }
        };
    }

    public static void main(String[] args) {

        Sequence03 nums = new Sequence03(10);
        for(int i = 0; i < 10; i++){
            nums.add(i);
        }

        Selector selector = nums.selector();

        while (!selector.end()){
            System.out.print(selector.current() + " ");
            selector.next();
        }

        System.out.println();

        Selector selector1 = nums.reverseSelector();
        while (!selector1.end()){
            System.out.print(selector1.current() + " ");
            selector1.next();
        }
    }
}
