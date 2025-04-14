package Ch19.Exercise;

import Ch19.atunit.Test;

import java.io.FileOutputStream;
import java.io.IOException;

public class AtUnitExample02 {

    public String methodOne () {
        return "This is methodOne";
    }

    public int methodTwo () {
        return 2;
    }

    @Test
    public void assertOne () {
        assert methodOne().equals("This is methodOne");
    }

    @Test
    public void assertTwo () {
        assert methodTwo() == 1 : "What a surprise";
    }

    @Test
    public void failException () throws IOException {
        new FileOutputStream("notExsit.out");
    }

    @Test
    public boolean returnMessage() {
        assert methodTwo() == 2 : "pass the 1st line.";
        return methodOne().equals("This is methodOne");
    }

    public static void main(String[] args) {

    }

}
