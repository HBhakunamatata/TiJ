package Ch14.Exercise;

// Demonstrate array covariance using Numbers and Integers.

public class Exercise26 {
    public static void main(String[] args) {
        Number [] numbers = new Integer [10] ;

        numbers[0] = new Integer(1);

        try {
            numbers[1] = new Float(1.1);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
