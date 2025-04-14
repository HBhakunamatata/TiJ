package Ch14.Exercise;

/*
Create an interface with two methods,
and a class that implements that interface and adds another method.
In another class, create a generic method with
an argument type that is bounded by the interface, and show that
the methods in the interface are callable inside this generic method.
In main(), pass an instance of the implementing class to the generic method.
 */

interface InterfaceA {
    void fun1();
    void fun2();
}

class ClassA implements InterfaceA {

    @Override
    public void fun1() {
        System.out.println("fun1() ...");
    }

    @Override
    public void fun2() {
        System.out.println("fun2() ...");
    }

    public void addedFun() {
        System.out.println("addedFun() ...");
    }
}
public class Exercise20 {

    public static <T extends InterfaceA> void callFun (T obj) {
        obj.fun1();
        obj.fun2();
    }

    public static void main(String[] args) {
        callFun(new ClassA());
    }
    
}
