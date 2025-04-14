package Ch06.Exercise;

import static net.mindview.util.Print.*;
import java.util.Random;

class A {
    A(){
        print("A Constructor");
    }
}

class B {
    B() {
        print("B Constructor");
    }
}

public class C extends A {
    private B [] bbb;

    public static void main(String[] args) {
        new C();
    }

}
