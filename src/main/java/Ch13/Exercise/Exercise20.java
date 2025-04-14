package Ch13.Exercise;

/*
  Look up the interface for java.lang.Class in the JDK documentation from http://java.sun.com.
  Write a program that takes the name of a class as a command-line argument,
  then uses the Class methods to dump all the information available for that class.
  Test your program with a standard library class and a class you create.
 */

public class Exercise20 {
    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName(args[0]);
            c.getInterfaces();
            c.getDeclaredFields();
            c.getConstructor();
            c.getMethods();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
