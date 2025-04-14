package Ch19.Exercise;

import Ch19.atunit.Test;
import net.mindview.util.OSExecute;

import java.io.File;

public class AtUnitExample {

    public String methodOne() {
        return "This is methodOne";
    }

    public int methodTwo () {
        System.out.println("This is method two");
        return 2;
    }

    @Test
    public boolean testMethodOne () {
        return methodOne().equals("This is methodOne");
    }

    @Test
    public boolean testMethodTwo () {
        return methodTwo() == 2;
    }

    @Test
    public boolean fail() {
        return false;
    }

    // Shows output for failure:
    @Test boolean failureTest() {
        return false;
    }
    @Test boolean anotherDisappointment() {
        return false;
    }

    public static void main(String[] args) {
        File f = new File(AtUnitExample.class.getResource("").getPath());
        System.out.println(f);
        OSExecute.command("java out.production.TiJ.Ch19.Exercise.AtUnitExample");
    }

}
