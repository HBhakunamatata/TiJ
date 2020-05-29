package Ch11.Exercise;

/*
Modify Exercise 3 so that the catch clause logs the results.
 */

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Exercise07 {

    private static Logger logger = Logger.getLogger("ExceptionInExercise07");

    public static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void main(String[] args) {
        int [] nums = new int[5];
        try {
            nums[6] = 5;
        }catch (ArrayIndexOutOfBoundsException e) {
            logException(e);
        }
    }
}
