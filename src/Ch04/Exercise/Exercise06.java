package Ch04.Exercise;

/*
 * Modify the previous exercise so that two of the overloaded methods have
two arguments (of two different types), but in reversed order relative to each other. Verify
that this works.
 */

class Seller {
    void charge(int i, String s){
        System.out.println("int first: " + i + " for " + s);
    }

    void charge(String s, int i){
        System.out.println("String first: " + s + " for " + i);
    }
}

public class Exercise06 {
    public static void main(String[] args) {
        new Seller().charge(30, "meat");
        new Seller().charge("beef", 35);
    }

}
