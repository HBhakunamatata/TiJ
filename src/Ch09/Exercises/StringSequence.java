package Ch09.Exercises;

// Exercise02

import java.util.Arrays;

public class StringSequence {

    private String [] strings;
    private int i;

    StringSequence(int size) {
        strings = new String [size];
    }

    public void add(String item){
        if(i < strings.length){
            strings[i++] = item;
        }
    }

    public Selector selector(){
        return new StringSelector();
    }

    @Override
    public String toString() {
        return "StringSequence{" +
                "strings=" + Arrays.toString(strings) +
                '}';
    }

    private class StringSelector implements Selector{
        private int i;

        @Override
        public boolean end() {
            return i == strings.length;
        }

        @Override
        public void next() {
            if(i < strings.length){
                i++;
            }
        }

        @Override
        public Object current() {
            return strings[i];
        }
    }

    public static void main(String[] args) {
        StringSequence ss = new StringSequence(10);
        for(int i = 0; i < 10; i++){
            ss.add("" + i);
        }

        Selector selector = ss.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
        System.out.println();

        System.out.println(ss.toString());
    }
}
