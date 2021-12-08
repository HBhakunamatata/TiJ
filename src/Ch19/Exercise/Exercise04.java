package Ch19.Exercise;

import Ch19.atunit.Test;

/*
 * Exercise 4:
 * Verify that a new testObject
 * is created before each test.
 */
public class Exercise04 {

    AtUnitExample testObject;

    @Test public void testIsExist(Object o) {
        assert o == null;
    }

    @Test public boolean testMethodOne() {
        testIsExist(testObject);
        return testObject.methodOne().equals("This is methodTwo");
    }

    @Test public boolean testMethodTwo() {
        testObject = new AtUnitExample();
        testIsExist(testObject);
        return testObject.methodTwo() == 2;
    }

    public static void main(String[] args) {

    }
}
