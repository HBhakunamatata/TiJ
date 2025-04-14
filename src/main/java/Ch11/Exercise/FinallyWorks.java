package Ch11.Exercise;

class ThreeExeception extends Exception { }

public class FinallyWorks {
    private static int index = 0;
    public static void main(String[] args) {
        while (true) {
            try{
                if(index++ == 0)
                    throw new ThreeExeception();
                System.out.println("No Exception");
            }catch (Exception e) {
                System.out.println("Caught an Exception");
            }finally {
                System.out.println("Inside final block");
                if(index == 2) break;
            }
        }
    }
}
