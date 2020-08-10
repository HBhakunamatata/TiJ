package Ch14.Exercise;

import java.util.HashSet;

class Manipulator02 <T extends HasF> {
    private T obj;

    public Manipulator02(T obj) {
        this.obj = obj;
    }

    public void manipulate () {
        obj.f();
    }
}

public class Manipulation {

    public static void main(String[] args) {
        HasF hasF = new HasF();
        Manipulator02 <HasF> manipulator = new Manipulator02<>(hasF);
        manipulator.manipulate();
    }
}
