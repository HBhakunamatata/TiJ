package Ch20.Exercise;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

class X {
    String f() {
        return "X::f()";
    }
}

interface MakeString {
    String make();
}

interface TransformX {
    String transformX(X x);
}

public class UnboundMethodReference {

    public static void main(String[] args) {
        // MakeString ms = X::f; // [1]
        X x = new X();
        TransformX sp = X::f;

        // [2] The same effect
        System.out.println(sp.transformX(x));
        System.out.println(x.f());
    }


}
