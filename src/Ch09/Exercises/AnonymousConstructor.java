package Ch09.Exercises;

// Creating a constructor for an anonymous inner class.
// This also can imply the order of constructor in anonymous class.
import static net.mindview.util.Print.*;

abstract class Base {
    Base(int arg) {
        print("Constructor in Based class");
    }
    abstract public void f();
}

public class AnonymousConstructor {
    public Base getBase (int value) {
        return new Base(value) {
            private int i;

            {
                print("Consructor in anonymous class");
            }

            @Override
            public void f() {
                print("Calling f() in Anonymous");
            }
        };
    }

    public static void main(String[] args) {
        AnonymousConstructor ac = new AnonymousConstructor();
        Base base = ac.getBase(12);
        base.f();
    }
}
