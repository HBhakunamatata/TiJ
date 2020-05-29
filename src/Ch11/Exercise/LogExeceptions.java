package Ch11.Exercise;

import sun.rmi.runtime.Log;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class LogExeceptions extends Exception {
    private static Logger logger = Logger.getLogger("LogException");
    public LogExeceptions() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void main(String[] args) {
        try{
            throw new LogExeceptions();
        }catch (LogExeceptions e){

        }
    }
}
