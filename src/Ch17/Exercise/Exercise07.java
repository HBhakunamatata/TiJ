package Ch17.Exercise;

/*
 * Open a text file so that you can read the file one line at a time.
 * Read each line as a String and place that String object into a LinkedList.
 * Print all of the lines in the LinkedList in reverse order.
 */

import java.io.*;
import java.util.*;

public class Exercise07 {

    public static String [] readReverce (String filePath) throws IOException {
        File file = new File(filePath);
        BufferedReader reader = new BufferedReader(new FileReader(file));

        List<String> stringList = new LinkedList<>();
        String s;
        while ( (s = reader.readLine()) != null )
            stringList.add(s + '\n');
        Collections.reverse( stringList );

        return stringList.toArray(new String [stringList.size()]);

    }


    public static void main(String[] args) {
        try {
            System.out.println( Arrays.toString(
                    readReverce("./src/Ch17/Exercise/Exercise07.java")
            ));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
