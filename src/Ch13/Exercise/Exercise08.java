package Ch13.Exercise;

/*
 * Write a method that takes an object and recursively prints
 *   all the classes in that object’s hierarchy.
 */

public class Exercise08 {
    public static void printBased_r(Class cc) {
        System.out.println("The based class : ");
        for ( Class c : cc.getInterfaces() ) {
            System.out.println(c.getSimpleName());
        }
    }

    // Test the function
    public static void main(String[] args) {
        try {
            printBased_r(Class.forName("Ch13.Exercise.FancyToy"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
