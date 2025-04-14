package Ch11.Exercise;


import java.io.FileInputStream;

public class Exercise26 {
    // Pass all exceptions to the console
    public static void main(String[] args) throws Exception {
        String wrongPath = "wrongpath";
        FileInputStream file = new FileInputStream(wrongPath);
        // Use the file ...
        // Close the file
        file.close();
    }
}