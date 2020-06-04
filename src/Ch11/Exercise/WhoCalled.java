package Ch11.Exercise;

public class WhoCalled {
    static void f() {
        try{
            throw new Exception();
        } catch (Exception e) {
            for (StackTraceElement s : e.getStackTrace()
                 ) {
                System.out.println(s);
            }
        }
    }

    static void g() {
        f();
    }

    static void h() {
        g();
    }

    public static void main(String[] args) {

        f();

        System.out.println(
                "--------------------------------------"
        );

        g();

        System.out.println(
                "--------------------------------------"
        );

        h();
    }
}
