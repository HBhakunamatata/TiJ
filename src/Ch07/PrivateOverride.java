package Ch07;

import static net.mindview.util.Print.*;

public class PrivateOverride {
    private void f(){
        print("Private method in based class");
    }

    public static void main(String[] args) {
        PrivateOverride i = new Derived();
        i.f();
    }
}

class Derived extends PrivateOverride {
    public void f(){
        print("Public method in derived class");
    }
}

/*
 * A private method is automatically final,
 * and is also hidden from the derived class.
 * So Derived’s f() in this case is a brand new method;
 * it’s not even overloaded, since the base-class version
 * of f() isn’t visible in Derived.
 *
 * To be clear, you should use a different name from
 * a private base-class method in your derived class.
 */