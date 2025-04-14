package Ch09.Exercise6_B;

import Ch09.Exercise6_A.*;

public class ClassinB {
    protected class Inner implements InterfaceinA{

        // explicitly define the constructor 'public', otherwise it will be protected.
        public Inner() { }

        @Override
        public void f() {
            System.out.println("f() implemented in package B.");
        }
    }
}
