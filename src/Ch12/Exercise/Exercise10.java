package Ch12.Exercise;

/*
  For the phrase "Java now has regular expressions" evaluate
    whether the following expressions will find a match:
    ^Java
    \Breg.*
    n.w\s+h(a|i)s
    s?
    s*
    s+
    s{4}
    S{1}.
    s{0,3}
    376
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise10 {

    static String [] regres = {
        "^Java",
        "\\Breg.*",
        "n.w\\s+h(a|i)s",
        "s?",
        "s*",
        "s+",
        "s{4}",
        "S{1}.",
        "s{0,3}",
        "376"
    };

    static String text = "Java now has regular expressions";

    public static void main(String[] args) {
        System.out.println("Text : \n" + text);
        for (int i = 0; i < regres.length; i++) {
            System.out.println(regres[i] + ":\n");
            Pattern p  = Pattern.compile(regres[i]);
            Matcher m = p.matcher(text);
            while (m.find()) {
                System.out.println(m.group());
            }
        }
    }
}
