package Ch12.Exercise;

/*
  Using the documentation for java.util.regex.Pattern as a resource,
  write and test a regular expression that checks a sentence to see
  that it begins with a capital letter and ends with a period.

  See it in : https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
 */

public class Exercise07 {
    static String s = Splitting.knights;
    static String s1 = "Eating...";
    public static void main(String[] args) {
        System.out.println(s);
        System.out.println(s.matches("^[A-Z].*\\."));
        System.out.println(s1.matches("^[A-Z].*\\."));
    }
}
