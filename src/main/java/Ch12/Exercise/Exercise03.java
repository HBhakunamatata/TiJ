package Ch12.Exercise;

import java.io.PrintStream;
import java.util.Formatter;

/*
  Modify Turtle.java so that it sends all output to System.err.
 */

public class Exercise03 {
    public static void main(String[] args) {
        PrintStream ps = System.err;
        Turtle t1 = new Turtle("t1", new Formatter(ps));
        Turtle t2 = new Turtle("t2", new Formatter(System.err));
        t1.show(1,1);
        t2.show(2,2);
    }
}
