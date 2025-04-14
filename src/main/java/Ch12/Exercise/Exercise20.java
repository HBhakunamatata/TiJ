package Ch12.Exercise;

/*
  Create a class that contains int, long, float and double and String fields.
  Create a constructor for this class that takes a single String argument,
    and scans that string into the various fields.
  Add a toString( ) method and demonstrate that your class works correctly.
 */

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.Scanner;

public class Exercise20 {
    private int anInt;
    private long aLong;
    private float aFloat;
    private double aDouble;
    private String string;

    Exercise20(String s) {
        Scanner scanner = new Scanner(new BufferedReader(new StringReader(s)));
        anInt = scanner.nextInt();
        aLong = scanner.nextLong();
        aFloat = scanner.nextFloat();
        aDouble = scanner.nextDouble();
        string = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Exercise20{" +
                "anInt=" + anInt +
                ", aLong=" + aLong +
                ", aFloat=" + aFloat +
                ", aDouble=" + aDouble +
                ", string='" + string + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new Exercise20(
                Groups.POEM
        ));
    }
}
