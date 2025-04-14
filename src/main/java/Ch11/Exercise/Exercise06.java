package Ch11.Exercise;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/*
Create two exception classes, each of
which performs its own logging automatically.
Demonstrate that these work.
 */

class Exception1InExercise06 extends Exception {
    private static Logger logger = Logger.getLogger("Logger01Exercise06");
    public Exception1InExercise06(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

class Exception2InExercise06 extends Exception {
    private static Logger logger = Logger.getLogger("Logger02Exercise06");
    public Exception2InExercise06(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

public class Exercise06 {
    public static void main(String[] args) {
        try{
            throw new Exception1InExercise06();
        }catch (Exception e){
            System.err.println("Caught an Exception ..");
        }

        try{
            throw new Exception2InExercise06();
        }catch (Exception e){
            System.err.println("Caught an Exception ..");
        }
    }
}
