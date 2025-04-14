package Ch11.Exercise;

/*
Create a three-level hierarchy of exceptions.
Now create a base-class A with a method
    that throws an exception at the base of your hierarchy.
Inherit B from A and override the method
    so it throws an exception at level two of your hierarchy.
Repeat by inheriting class C from B.
In main( ), create a C and upcast it to A, then call the method.
 */

// Usage:
// class Annoyance extends Exception {}
// class Sneeze extends Annoyance {}

class A {
    void fun() throws Exception {
        throw new Exception();
    }
}

class B extends A {
    @Override
    void fun() throws Annoyance {
        throw new Annoyance();
    }
}

class C extends B {
    @Override
    void fun() throws Sneeze {
        throw new Sneeze();
    }
}

public class Exercise25 {
    public static void main(String[] args) {
        try {
            A x = new C();
            x.fun();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
