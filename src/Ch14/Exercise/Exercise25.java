package Ch14.Exercise;

/*
    Create two interfaces and a class that implements both.
    Create two generic methods, one whose argument parameter
    is bounded by the first interface and one whose argument
    parameter is bounded by the second interface. Create an
    instance of the class that implements both interfaces,
    and show that it can be used with both generic methods.
 */
interface InterfaceB {
    void funB();
}

interface InterfaceC {
    void funC();
}

class Both implements InterfaceB, InterfaceC {

    @Override
    public void funB() {
        System.out.println("funB() in Both ...");
    }

    @Override
    public void funC() {
        System.out.println("funC() in Both ...");
    }
}

public class Exercise25 {
    static <T extends InterfaceB> void fun1(T item) {
        item.funB();
    }

    static <T extends InterfaceC> void fun2(T item) {
        item.funC();
    }

    public static void main(String[] args) {
        Both both = new Both();
        fun1(both);
        fun2(both);
    }

}


// 使用generic可以实现方法重载