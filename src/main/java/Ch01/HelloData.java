package Ch01;

/*
 * program default include lang package.
 * when use the other packages we need to use "import"
 *
 *
 */
import java.util.Date;  // data is not in the lang

public class HelloData {
    public static void main(String[] args) {
        System.out.println("This is :");    // use static method
        System.out.println(new Date()); // when using, Date will transfer to String
    }
}
