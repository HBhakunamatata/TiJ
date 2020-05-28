package Ch11.Exercise;
/*
Create a class with a main( ) that throws an object of class Exception inside a try block.
Give the constructor for Exception a String argument.
Catch the exception inside a catch clause and print the String argument.
Add a finally clause and print a message to prove you were there
 */

public class Exercise01 {
    public static void main(String[] args) {
        String s = "Throwing an Exception";
        try {
            throw new Exception(s);
        }catch (Exception e){
            System.out.println("Catching a Exception");
            e.printStackTrace(System.out);
        }
        finally {
            System.out.println("Running in finally");
        }
    }
}
