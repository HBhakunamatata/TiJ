package Ch19.Exercise;

import Ch19.atunit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * Exercise 6 Test LinkedList using the
 * approach shown in HashSetTest.java.
 */
public class Exercise06 {
    List<String> testObject = new LinkedList<>();

    @Test public void initial() {
        assert testObject.isEmpty();
    }

    @Test public void _contains() {
        testObject.add("one");
        assert testObject.contains("one");
    }

    @Test public void _remove() {
        testObject.add("one");
        testObject.remove("one");
        assert testObject.contains("one");
    }

    public static void main(String[] args) {

    }
}
