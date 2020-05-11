package Ch09.Exercises;

/*
 * Create a class with an inner class. In a separate class, make an instance of
the inner class.
 */

public class Exercise05 {
    Outer outer = new Outer();

    // one way
    Outer.Inner h1 = outer.getInner();
    // another way
    Outer.Inner h2 = outer.new Inner();
}
