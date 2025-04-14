package Ch13.Exercise;

import static net.mindview.util.Print.print;

interface Interface {
    void doSomething();
    void doOtherthing(String arg);
}

class RealObject implements Interface {

    @Override
    public void doSomething() {
        print("doSomething");
    }

    @Override
    public void doOtherthing(String arg) {
        print("doOtherthing " + arg);
    }
}

class SimpleProxy implements Interface {

    private Interface proxied;

    public SimpleProxy (Interface proxied) {
        this.proxied = proxied;
    }

    @Override
    public void doSomething() {
        print("SimpleProxy doSomething");
        proxied.doSomething();
    }

    @Override
    public void doOtherthing(String arg) {
        print("SimpleProxy somethingElse " + arg);
        proxied.doOtherthing(arg);
    }
}

public class SimpleProxyDemo {
    public static void consumer (Interface inter) {
        inter.doSomething();
        inter.doOtherthing("HB");
    }
    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
}
