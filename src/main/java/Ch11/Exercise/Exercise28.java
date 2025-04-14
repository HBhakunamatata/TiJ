package Ch11.Exercise;

/*
  Modify Exercise 4 so that the custom exception class inherits from RuntimeException,
  and show that the compiler allows you to leave out the try block.
 */

class MyException03 extends RuntimeException {

}

public class Exercise28 {
    public static void main(String[] args) {
        throw new MyException03();
    }
}
