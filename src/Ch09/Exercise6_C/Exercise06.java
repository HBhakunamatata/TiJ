package Ch09.Exercise6_C;

import Ch09.Exercise6_B.ClassinB;

public class Exercise06 extends ClassinB {

    public Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Exercise06 exercise = new Exercise06();
        exercise.getInner().f();
    }
}
