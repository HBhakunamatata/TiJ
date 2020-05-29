package Ch11.Exercise;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class LogExceptions2 {
    private static Logger logger = Logger.getLogger("LogExceptions2");
    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void main(String[] args) {
        try{
            throw new Exception();
        }catch (Exception e){
            logException(e);
        }
    }
}
