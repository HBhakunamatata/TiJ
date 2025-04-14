package Ch09.Exercises;

/*
Exercise 26: (2) Create a class with an inner class that has a non-default constructor
(one that takes arguments). Create a second class with an inner class that inherits from the
first inner class.

 */

class WithInner {
    class Inner {

    }
}

public class InheritInner extends WithInner.Inner {
    InheritInner (WithInner wi) {
        wi.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);

    }
}
