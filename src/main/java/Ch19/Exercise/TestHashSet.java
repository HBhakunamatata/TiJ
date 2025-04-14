package Ch19.Exercise;

import Ch19.atunit.Test;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {

    Set<String> testObj = new HashSet<>();

    @Test public void initial() {
        assert testObj.isEmpty();
    }

    @Test public void _contain() {
        testObj.add("one");
        assert  testObj.contains("one");
    }

    @Test public void _remove() {
        testObj.add("one");
        testObj.remove("one");
        assert testObj.contains("one");
    }

    public static void main(String[] args) {

    }
}
