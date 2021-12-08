package Ch19.Exercise;

import Ch19.atunit.Test;

public class Testable {
    public void execute() {
        System.out.println("Executing ...");
    }

    @Test
    void testExecute() {
        execute();
    }
}
