package Ch15.Exercise;

import java.util.ArrayList;

/*
 * Create the classes necessary for the Peel<Banana> example
 * and show that the compiler doesn’t accept it.
 * Fix the problem using an ArrayList.
 */

class Peel<T>{}
class Banana {}

public class Exercise09 {
    public static void main(String[] args) {
        // Peel<Banana>[] pb=new Peel<Banana>[10];
        ArrayList<Peel<Banana>> apb=new ArrayList<Peel<Banana>>();
    }

}
