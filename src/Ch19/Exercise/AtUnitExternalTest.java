package Ch19.Exercise;

import Ch19.atunit.Test;
import net.mindview.util.OSExecute;

public class AtUnitExternalTest extends AtUnitExample {
    @Test
    public boolean _methodOne() {
        return methodOne().equals("This is methodOne");
    }

    @Test
    public boolean _methodTwo() {
        return methodTwo() == 2;
    }

    public static void main(String[] args) {
        OSExecute.command("java ././/././.");
    }
}
