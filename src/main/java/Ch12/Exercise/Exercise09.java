package Ch12.Exercise;

/*
  Using the documentation for java.util.regex.Pattern as a resource,
  replace all the vowels in Splitting.knights with underscores.
 */

public class Exercise09 {
    static String s = Splitting.knights;

    public static void main(String[] args) {
        System.out.println(s);
        System.out.println(
                s.replaceAll("[aeiouAEIOU]", "_"));
    }
}
