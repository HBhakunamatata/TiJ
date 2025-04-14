package Ch09.Exercises;

class WithArgInner {
    class Inner {
        Inner(int i){
            i = 1;
        }
    }
}

public class Exercise24 {
    class Inner1 extends WithArgInner.Inner {
        private int j = 0;
        Inner1( WithArgInner wi, int arg){
            wi.super(arg);
            j = arg;
        }
    }

    public Inner1 getInner(WithArgInner wai, int arg) {
        return new Inner1(wai, arg);
    }

    public static void main(String[] args) {

        WithArgInner wai = new WithArgInner();

        Exercise24 exercise = new Exercise24();

        Exercise24.Inner1 inner1 = exercise.getInner(wai, 2);

    }
}
