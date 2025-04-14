package Ch11.Exercise;

public class Rethrowing {
    static void f() throws Exception {
        System.out.println("originating the exception in f()");
        throw new Exception("Exception thrown form f()");
    }

    static void g() throws Exception {
        try{
            f();
        } catch (Exception e) {
            System.out.println("Inside g(),e.printStackTrace()");
            e.printStackTrace(System.out);
            throw e;
        }
    }

    static void h() throws Exception {
        try{
            f();
        } catch (Exception e) {
            System.out.println("Inside h(),e.printStackTrace()");
            e.printStackTrace(System.out);
            throw (Exception) e.fillInStackTrace();
        }
    }

    public static void main(String[] args) {
        try{
            g();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

        System.out.println("-----------------------" +
                "---------------------------------");

        try{
            h();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
