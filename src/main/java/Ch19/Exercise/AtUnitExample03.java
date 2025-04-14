package Ch19.Exercise;

import Ch19.atunit.Test;
import Ch19.atunit.TestObjectCreate;
import net.mindview.util.OSExecute;

public class AtUnitExample03 {
    int n;
    public AtUnitExample03 (int n) {
        this.n = n;
    }

    public String methodOne() {
        return "This is methodOne";
    }

    public int methodTwo () {
        System.out.println("This is methodTwo");
        return 2;
    }

    @TestObjectCreate static
    AtUnitExample03 getInstance() {
        return new AtUnitExample03(47);
    }

    @Test public boolean initial() {
        return n == 47;
    }

    @Test public boolean testMethodOne() {
        return methodOne().equals("This is methodOne");
    }

    @Test public boolean m2() {
        return methodTwo() == 2;
    }

    public static void main(String[] args) {
        OSExecute.command("java Ch19.atunit.AtUnit AtUnitExample3");
    }
}

