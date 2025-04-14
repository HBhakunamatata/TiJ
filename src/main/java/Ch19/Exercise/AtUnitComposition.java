package Ch19.Exercise;

import Ch19.atunit.Test;
import net.mindview.util.OSExecute;

public class AtUnitComposition {
    AtUnitExample testObject = new AtUnitExample();

    @Test boolean _methodOne() {
        return testObject.methodOne().equals("This is methodOne");
    }

    @Test boolean _methodTwo() {
        return testObject.methodTwo() == 2;
    }

    public static void main(String[] args) {
        OSExecute.command("java net.mindview.atunit.AtUnit AtUnitComposition");
    }
}
