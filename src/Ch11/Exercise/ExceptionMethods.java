package Ch11.Exercise;

import static net.mindview.util.Print.*;

public class ExceptionMethods {
    public static void main(String[] args) {
        try{
            throw new Exception("Exception Methods");
        } catch (Exception e) {
            print("getMessage:" + e.getMessage());
            print("getLocalizedMessage" + e.getLocalizedMessage());
            print("toString" + e.toString());

            print("printStackTrace():");
            e.printStackTrace(System.out);
            print("fillInStackTrace():");
            e.fillInStackTrace();
        }
    }
}
