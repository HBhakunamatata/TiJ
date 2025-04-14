package Ch09.Exercises;

//  Qualifying access to the outer-class object.

public class Dotthis {

    public Inner getInner(){
        return new Inner();
    }

    private class Inner {
        public Dotthis getOuter(){
            return Dotthis.this;
        }
    }

    void f() {
        System.out.println("Dotthis f()");
    }

    public static void main(String[] args) {
        Dotthis dt = new Dotthis();
        Inner in = dt.getInner();
        in.getOuter().f();
    }
}
