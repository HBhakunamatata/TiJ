package Ch17.Exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedInputFile {

    public static String read (String filePath) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String s;

        while ( (s = reader.readLine()) != null) {
            sb.append(s + '\n');
        }
        reader.close();
        return sb.toString();
    }

    public static void main(String[] args) {
        try {
            System.out.println(read("./src/Ch17/Exercise/bufferedInputFile.java"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
