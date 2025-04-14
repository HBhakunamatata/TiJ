package Ch09;

interface A {}
interface B {}

class X implements A, B {

}

class Y implements A {
    private class BB implements B{ }
    public B getB() {
        return new BB();
    }
}

public class MultiInterface {
    static void takeA(A a) { }
    static void takeB(B b) { }

    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        takeA(x);
        takeB(x);

        takeA(y);
        takeB(y.getB());
    }
}
