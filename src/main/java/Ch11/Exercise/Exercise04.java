package Ch11.Exercise;

/*
Create your own exception class using the extends keyword.
Write a constructor for this class that takes a String argument
and stores it inside the object with a String reference.
Write a method that displays the stored String.
Create a try-catch clause to exercise your new exception.
 */

class MyException02 extends Exception {
    String s;
    MyException02() { }
    MyException02(String s){
        super(s);
        this.s = s;
    }
    public void display() {
        System.out.println(s);
    }
}

public class Exercise04 {
    public static void main(String[] args) {
        try{
            throw new MyException02("This is an MyException02");
        }catch (MyException02 e){
            e.display();
        }
    }
}
