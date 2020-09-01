package Ch17.Exercise;

/*
 * Modify Exercise 8 to also open a text file
 * so you can write text into it.
 * Write the lines in the LinkedList,
 * along with line numbers (do not attempt to use
 * the "LineNumber" classes), out to the file.
 */

import net.mindview.util.TextFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercise12 {
    public static void writeReverce
            (String readFrom, String writeTo) throws IOException {

        String [] temp = Exercise07.readReverce(readFrom);

        PrintWriter writer = new PrintWriter(
                new BufferedWriter(
                        new FileWriter(writeTo)
                )
        );

        int lineCounter = 1;

        for (String s : temp) {
            writer.println(lineCounter++ + " : " + s);
        }

        writer.close();

    }

    public static void main(String[] args) {
        String read = Util.prefix + "Exercise12.java";
        String write = Util.prefix + "Exercise12.out";

        try {
            writeReverce(read, write);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(TextFile.read(write));
    }
}
