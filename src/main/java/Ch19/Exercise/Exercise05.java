package Ch19.Exercise;

import Ch19.atunit.Test;

/*
 * Exercise 5: Modify the above Exercise04
 *  to use the inheritance approach.
 */

public class Exercise05 extends Exercise04 {
    @Test
    public boolean testMethodTwo() {
        testObject = new AtUnitExample();
        testIsExist(testObject);
        return testObject.methodTwo() == 2;
    }

    public static void main(String[] args) {

    }
}
