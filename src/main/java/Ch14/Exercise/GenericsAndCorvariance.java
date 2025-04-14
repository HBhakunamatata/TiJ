package Ch14.Exercise;

import java.util.*;


// Won't compile
public class GenericsAndCorvariance {

    public static void main(String[] args) {
        List<? extends Fruit> flist = new ArrayList<Apple>();
        //flist.add(new Apple());
        //flist.add(new Fruit());
        //flist.add(new Object());
        //flist.add(new Orange());

        // We knows that compiler returns at least Fruit
        //Fruit fruit = flist.get(0);  // No error
    }
}
