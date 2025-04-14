package Ch17.Exercise;

/*
 * Modify Exercise 8 to take additional command-line
 * arguments of words to find in the file.
 * Print all lines in which any of the words match.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public class Exercise10 {
    public static String [] readMatcher
            (String filePath, String regex) throws IOException {

        BufferedReader reader =
                new BufferedReader( new FileReader(new File(filePath)));

        List <String> stringList = new LinkedList<>();
        Pattern pattern = Pattern.compile(regex);

        String s;

        while ( (s = reader.readLine()) != null
                && pattern.matcher(s).matches() ) {
            stringList.add(s);
        }

        return stringList.toArray(new String [stringList.size()] );
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            throw new RuntimeException("Short of length 2");
        }

        try {
            System.out.println( Arrays.toString(
                    readMatcher(args[0], args[1])
            ));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
