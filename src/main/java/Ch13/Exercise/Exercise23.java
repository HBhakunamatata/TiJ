package Ch13.Exercise;

/*
  Inside invoke() in SimpleDynamicProxy.java,
  try to print the proxy argument and explain what happens.
 */


import java.lang.reflect.*;

class DynamicProxyShower implements InvocationHandler {
    //counter here
    private static long count=0;
    private Object proxied;
    public DynamicProxyShower(Object proxied) {
        this.proxied = proxied;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //parameters are already printed here
        System.out.println("**** proxy: " + proxy.getClass() + ", method: " + method + ", args: " + args);
        if(args != null){
            for(Object arg : args){
                System.out.println(" " + arg);
            }
        }
        try{
            Object o = method.invoke(proxied, args);
            count++;
            return o;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    //add a method in the handler to show the count
    public static void showCount(){
        System.out.println("Proxy is invoked " + count + " times!");
    }
}

public class Exercise23 {

    public static void main(String[] args) {
        RealObject real = new RealObject();
        Exercise21.consumer(real);
        // Insert a proxy and call again:
        Interface proxy = (Interface)Proxy.newProxyInstance(Interface.class.getClassLoader(), new Class<?>[]{ Interface.class }, new DynamicProxyHandler(real));
        Exercise21.consumer(proxy);
        Exercise21.consumer(proxy);
        Exercise21.consumer(proxy);
        //show count here
        DynamicProxyShower.showCount();
    }
}