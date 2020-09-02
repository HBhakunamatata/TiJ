package Ch17.Exercise;

import java.io.*;

public class Echo {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        System.in
                )
        );

        String s;

        while ( (s = reader.readLine()) != null && s.length() != 0 ) {
            System.out.println(s);
        }

    }
}
