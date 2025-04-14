package Ch17.Exercise;

/*
 * Write a program that takes standard input and
 * capitalizes all characters, then puts the results
 * on standard output.
 * Redirect the contents of a file into this program
 * (the process of redirection will vary depending on your operating system).
 */

import java.io.*;

public class Exercise21 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        System.in
                )
        );

        String outFile = Util.prefix + "redirectOut01.dat";

        PrintStream filePrinter = new PrintStream(
                new BufferedOutputStream(
                        new FileOutputStream(outFile)
                )
        );

        // redirect
        System.setOut(filePrinter);

        String s;
        try {
            while ( (s = reader.readLine()) != null && s.length() != 0 ){
                System.out.println(s.toUpperCase());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            filePrinter.close();
        }

    }

}
