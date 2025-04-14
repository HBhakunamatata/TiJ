package Ch06;

/*
 * Overloading a base-class method name in a derived class
 * does not hide the base-class versions.
 */

class Homer {
    public void doh(){
        System.out.println("doh()");
    }
}

class Bart {}

class Milhouse extends Homer {
    public void doh(int number) {
        System.out.println("doh(int)");
    }

    public void doh(Bart bart) {
        System.out.println("doh(Bart)");
    }
}

public class NameHide {
    public static void main(String[] args) {
        Bart bart = new Bart();

        Milhouse milhouse = new Milhouse();
        milhouse.doh();
        milhouse.doh(11);
        milhouse.doh(bart);
    }
}
