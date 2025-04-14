package Ch17.Exercise;

/*
 * Using TextFile and a Map<Character,Integer>,
 * create a program that counts the occurrence of all
 * the different characters in a file.
 * (So if there are 12 occurrences of the letter ‘a’
 * in the file, the Integer associated with the Character
 * containing ‘a’ in the Map contains ‘12’).
 */

import net.mindview.util.TextFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;

class CharacterCounter extends HashMap <Character, Integer> {

    // private String filePath;

    public  CharacterCounter (String filePath) {
        initMap( Util.prefix + filePath );
    }

    public void initMap (String filePath) {

        StringReader reader = null;
        try {
             reader = new StringReader( TextFile.read(filePath) );
            int i;
            try {
                while ( (i = reader.read()) != -1 ) {

                    char c = (char) i;

                    if ( this.containsKey(c) ) {
                        this.put(c, this.get(c) + 1);
                    }
                    else {
                        this.put(c, 1);
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } finally {
            reader.close();
        }

    }

}

public class Exercise17 {

    public static void main(String[] args) {
        CharacterCounter counter = new CharacterCounter("Exercise17.java");
        System.out.println(counter);
    }

}
