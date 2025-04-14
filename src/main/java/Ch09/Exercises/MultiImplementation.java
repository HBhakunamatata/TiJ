package Ch09.Exercises;

class D {}
abstract class E {}
class F extends D {
    public E getE() {
        return new E() { };
    }
}

public class MultiImplementation {
    static void takeD(D d){}
    static void takeE(E e) {}

    public static void main(String[] args) {
        F f = new F();
        takeD(f);
        takeE(f.getE());


    }
}
