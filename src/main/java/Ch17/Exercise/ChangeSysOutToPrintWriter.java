package Ch17.Exercise;

import java.io.PrintWriter;

// Turn System.out into a PrintWriter.

// It’s important to set the second argument to true
// in order to enable automatic flushing;
// otherwise, you may not see the output.

public class ChangeSysOutToPrintWriter {

    public static void main(String[] args) {
        PrintWriter newOut = new PrintWriter(System.out, true);
        newOut.println("Hello System.out");
    }

}
