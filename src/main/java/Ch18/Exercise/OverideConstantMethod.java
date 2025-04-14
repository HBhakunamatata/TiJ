package Ch18.Exercise;

import static net.mindview.util.Print.*;

public enum OverideConstantMethod {

    NUT , BOLT,
    WASHER {
        void f() {
            print("Override method f()");
        }
    };

    void f() {
        print("Default method f()");
    }

    public static void main(String[] args) {
        for (OverideConstantMethod ecm : OverideConstantMethod.values()) {
            printnb(ecm + " : ");
            ecm.f();
        }
    }
}
