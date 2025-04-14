package Ch08.Exercise.exercise04;

/*
 *  Create an abstract class with no methods. Derive a class and add a method.
 * Create a static method that takes a reference to the base class, downcasts it to the
derived class, and calls the method. In main( ), demonstrate that it works. Now put the
abstract declaration for the method in the base class, thus eliminating the need for the
downcast
 */

public class DerivedClass extends AbClass {
    public void omethod() {
        System.out.println("omethod in derived class");
    }
    static void smethod(AbClass a){
        ((DerivedClass)a).omethod();  // Poriority: . > ordinary
    }

    public static void main(String[] args) {
        DerivedClass.smethod(new DerivedClass());
    }
}
