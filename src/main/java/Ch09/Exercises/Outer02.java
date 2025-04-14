package Ch09.Exercises;

// Exercise03

class Outer02 {

    private String s;

    Outer02(String s) {
        this.s = s;
    }

    class Inner {
        @Override
        public String toString() {
            return s;
        }
    }

    public Inner getInner(){
        return new Inner();
    }

    public static void main(String[] args) {
        Outer02 o = new Outer02("Test");
        Outer02.Inner oi = o.getInner();
        System.out.println(oi.toString());
    }
}
