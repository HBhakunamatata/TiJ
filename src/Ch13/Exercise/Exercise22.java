package Ch13.Exercise;

/*
  Modify SimpleDynamicProxy.java so that it measures method-call times.
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;

class CounterDynamicProxy implements InvocationHandler {
    private Object proxied;
    private HashMap <String, Integer> counter;

    public CounterDynamicProxy(Object proxied) {
        this.proxied = proxied;
        counter = new HashMap<>();
    }

    public HashMap <String, Integer> getCounter() {
        return counter;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String funName = method.getName();
        if (counter.containsKey(funName)) {
            counter.put(funName, counter.get(funName) + 1);
        }
        else {
            counter.put(funName, 1);
        }
        return method.invoke(proxied, args);
    }
}

public class Exercise22 {
    public static void main(String[] args) {
        CounterDynamicProxy ih = new CounterDynamicProxy(new RealObject());
        Interface proxy = (Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[] {Interface.class},
                ih  // an implementation of InvocationHandler
        );
        for (int i = 0; i < 5; i++) {
            Exercise21.consumer(proxy);
        }
        System.out.println(ih.getCounter());
    }
}
