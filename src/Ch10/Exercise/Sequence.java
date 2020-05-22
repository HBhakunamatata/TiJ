package Ch10.Exercise;

// Exercise 3
// Modify innerclasses/Sequence.java so that you can add any number of elements to it.

import Ch09.Exercises.Selector;

public class Sequence {
    private int i;
    private int [] items;
    Sequence(int size) {
        items = new int [size];
    }

    private void resize(){
        int [] newItems;
        if(i == items.length){
            newItems = new int [items.length * 2];
            for (int j = 0; j < items.length; j++) {
                newItems[j] = items[j];
            }
            items = newItems;
        }
    }

    public void add (int element) {
        resize();
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

        Sequence nums = new Sequence(3);
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
