package Ch17.Exercise;

/*
 * Create a Serializable class containing a reference
 * to an object of a second Serializable class.
 * Create an instance of your class, serialize it to disk,
 * then restore it and verify that the process worked correctly.
 */

import javafx.util.Builder;

import java.io.*;
import java.util.Random;

class Info implements Serializable {
    private int d;

    public Info () {
        System.out.println("Default");
    }

    public Info(int d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return Integer.toString(d);
    }
}

class TrojanHorse implements Serializable {

    private Random random = new Random();

    private Info [] infos = new Info [] {
        new Info(random.nextInt(10)),
        new Info(random.nextInt(10)),
        new Info(random.nextInt(10))
    };

    private char c;
    private TrojanHorse next;

    public TrojanHorse (int x, int i) {
        c = (char) x;
        if (i-- > 0)
            next = new TrojanHorse( x + 1, i);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(":");
        sb.append(c + "(");
        for (Info i : infos) {
            sb.append(i);
        }
        sb.append(")");
        sb.append(next);
        return sb.toString();
    }
}

public class Exercise27 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String filePath = Util.prefix + "Exercise27.dat";

        TrojanHorse th = new TrojanHorse(97, 5);

        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(filePath)
        );

        out.writeObject(th);
        out.close();

        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(filePath)
        );

        TrojanHorse th2 = (TrojanHorse) in.readObject();

        in.close();

        System.out.println(th2);

        System.out.println("===================================");


        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ObjectOutputStream out02 = new ObjectOutputStream (bout);

        out02.writeObject(th2);
        out02.flush();

        ObjectInputStream in02 = new ObjectInputStream(
                new ByteArrayInputStream(bout.toByteArray())
        );
        in02.close();

        TrojanHorse th03 = (TrojanHorse) in02.readObject();

        System.out.println(th03);


    }

}
