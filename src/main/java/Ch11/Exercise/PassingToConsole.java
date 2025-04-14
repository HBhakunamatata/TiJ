package Ch11.Exercise;

import java.io.FileInputStream;

public class PassingToConsole {
    // Pass all exceptions to the console
    public static void main(String[] args) throws Exception {
        FileInputStream file = new FileInputStream(
                "src/Ch11/Exercise/PassingToConsole.java");
        // Use the file ...
        // Close the file
        file.close();
    }
}
