package Ch17.Exercise;

/*
 * Modify Exercise 08 to force all the lines in the LinkedList
 * to uppercase and send the results to System.out.
 */

import java.util.*;
import java.io.*;

public class Exercise09 {

    public static String [] readReverceUpper (String filePath) throws IOException {

        File file = new File(filePath);
        BufferedReader reader = new BufferedReader(new FileReader(file));

        List<String> stringList = new LinkedList<>();
        String s;
        while ( (s = reader.readLine()) != null )
            stringList.add(s.toUpperCase() + '\n');
        Collections.reverse( stringList );

        return stringList.toArray(new String [stringList.size()]);
    }

    public static void main(String[] args) {
        try {
            System.out.println( Arrays.toString(
                    readReverceUpper("./src/Ch17/Exercise/Exercise09.java")
            ));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
