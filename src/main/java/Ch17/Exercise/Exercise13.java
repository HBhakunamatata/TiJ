package Ch17.Exercise;

/*
 * Modify BasicFileOutput.java so that it uses
 * LineNumberReader to keep track of the line count.
 * Note that it’s much easier to just keep track programmatically.
 */

import net.mindview.util.TextFile;

import java.io.*;

public class Exercise13 {

    public static void main(String[] args) throws IOException {

        String read = Util.prefix + "Exercise13.java";
        String write = Util.prefix + "Exercise13.out";

        LineNumberReader reader = new LineNumberReader(
                new BufferedReader(
                        new FileReader(read)
                )
        );

        PrintWriter writer = new PrintWriter(
                new BufferedWriter(
                        new FileWriter(write)
                )
        );

        String s;

        while ( (s = reader.readLine()) != null ) {
            writer.println(reader.getLineNumber() + " : " + s);
        }

        writer.close();

        System.out.println(TextFile.read(write));

    }

}
