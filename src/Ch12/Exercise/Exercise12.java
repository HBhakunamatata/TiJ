package Ch12.Exercise;

/*
  Modify Groups.java to count all of the unique words that do not start with a capital letter.
 */

import java.util.regex.*;
import static net.mindview.util.Print.*;

public class Exercise12 {

    public static void main(String[] args) {
        String POEM = Groups.POEM;
        Matcher m =
        Pattern.compile("(?m)(^|\\W)([a-z]\\w*)(\\W|$)")
                .matcher(POEM);
        while(m.find()) {
            for(int j = 0; j <= m.groupCount(); j++)
                printnb("[" + m.group(j) + "]");
                print();
        }
    }

}
