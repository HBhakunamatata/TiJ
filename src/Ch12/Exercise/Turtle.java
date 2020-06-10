package Ch12.Exercise;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Formatter;

public class Turtle {
    String name;
    Formatter f;
    Turtle(String name, Formatter f) {
        this.name = name;
        this.f = f;
    }

    public void show(int x, int y) {
        f.format("The turtle %s is at [%d, %d]\n", name, x, y);
    }

    public static void main(String[] args) {
        PrintStream pw = System.out;
        Turtle tommy = new Turtle("Tommy", new Formatter(System.out));
        Turtle terry = new Turtle("Terry", new Formatter(pw));
        tommy.show(1, 1);
        terry.show(2, 2);
    }
}
