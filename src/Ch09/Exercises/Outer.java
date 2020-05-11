package Ch09.Exercises;

// Exercise01

class Outer {
    class Inner {

    }

    public Inner getInner(){
        return new Inner();
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner oi = o.getInner();
    }
}
