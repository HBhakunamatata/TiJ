package Ch09.Exercises;

//  Creating an inner class directly using the .new syntax.

public class DotNew {

    public class Inner {

    }

    public Inner inner(){
        return new Inner();
    }

    public static void main(String[] args) {
        DotNew dn = new DotNew();

        // One way
        DotNew.Inner inner1 = dn.new Inner();
        // Another way
        DotNew.Inner inner2 = dn.inner();
    }

}
