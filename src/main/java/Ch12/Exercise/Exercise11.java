package Ch12.Exercise;

/*
    Apply the regular expression
        (?i)((^[aeiou])|(\s+[aeiou]))\w+?[aeiou]\b
    to
        "Arline ate eight apples and one orange while Anita hadn’t any"
 */

import java.util.regex.*;

public class Exercise11 {
    public static void main(String[] args) {
        String text = "Arline ate eight apples and one orange while Anita hadn’t any";
        String regex = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
