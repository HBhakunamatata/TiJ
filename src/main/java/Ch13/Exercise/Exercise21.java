package Ch13.Exercise;

/*
  Modify SimpleProxyDemo.java so that it measures method-call times.
 */

class CounterProxy implements Interface
{
    private static int method01Counter = 0;
    private static int method02Counter = 0;

    @Override
    public void doSomething() {
        System.out.println("In CounterProxy : ");
        System.out.println("doSomething");
        System.out.println("Method doSomething() is called "
                + method01Counter++ + (method01Counter==1 ? " time" : " times"));
    }

    @Override
    public void doOtherthing(String arg) {
        System.out.println("In CounterProxy : ");
        System.out.println("doOtherthing");
        System.out.println("Method doOtherthing() is called "
                + method02Counter++ + (method02Counter==1 ? " time" : " times"));
    }
}

public class Exercise21 {
    public static void consumer (Interface iface) {
        iface.doSomething();
        iface.doOtherthing("HB");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            consumer(new CounterProxy());
        }

    }
}
