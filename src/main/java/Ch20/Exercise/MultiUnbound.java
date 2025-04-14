package Ch20.Exercise;


class This {
    void two (int i, double d) {}
    void three (int i, double d, String s) {}
    void four (int i, double d, String s, char c) {}
}

interface TwoArgs {
    void call2 (This aThis, int i, double d);
}

interface ThreeArgs {
    void call3 (This aThis, int i, double d, String s);
}

interface FourArgs {
    void call4 (This aThis,int i, double d, String s, char c);
}

public class MultiUnbound {

    public static void main(String[] args) {
        TwoArgs twoArgs = This::two;
        ThreeArgs threeArgs = This::three;
        FourArgs fourArgs = This::four;

        This aThis = new This();

        twoArgs.call2(aThis, 1, 3.14);
        threeArgs.call3(aThis, 1, 3.14, "hello");
        fourArgs.call4(aThis, 1, 3.14, "Hello", 'f');
    }
}
