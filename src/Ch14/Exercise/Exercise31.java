package Ch14.Exercise;

/*
 * Remove all the generics from MultipleInterfaceVariants.java
 * and modify the code so that the example compiles.
 */

public class Exercise31 {

    interface Payable<T> {}
    class Employee implements Payable {}
    class Hourly extends Employee implements Payable {}

    public static void main(String[] args) {
        System.out.println("success");
    }
}
