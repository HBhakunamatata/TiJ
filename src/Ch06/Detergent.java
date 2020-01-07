package Ch06;

class Cleaner {
    protected String s;
    Cleaner(){
        s = "";
    }

    public void append (String a) {
        s += a;
    }

    public void add() {
        this.append(" add()");
    }

    public void sub() {
        append(" sub()");
    }

    public void mul() {
        append(" mul()");
    }

    @Override
    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleaner cleaner = new Cleaner();
        cleaner.add();
        cleaner.sub();
        cleaner.mul();

        System.out.println(cleaner);
    }
}

public class Detergent extends Cleaner {
    public Detergent() {

    }

    @Override
    public void mul() {
        s +=  " Detergent.mul()";
        super.mul();            // call the base class methods
    }

    public void div() {
        s += " Detergent.div()";
    }

    @Override
    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Detergent detergent = new Detergent();
        detergent.add();
        detergent.sub();
        detergent.mul();
        detergent.div();
        System.out.println(detergent);

        System.out.println("Testing the base class");
        Cleaner.main(args);


    }
}
