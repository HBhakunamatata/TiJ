package Ch11.Exercise;

// How an exception can be lost.
class VeryImportantException extends Exception {
    public String toString() {
        return "A very important exception!";
    }
}

class HoHumException extends Exception {
    public String toString() {
        return "A trivial exception";
    }
}

public class LostException {
    static void f() throws VeryImportantException {
        throw new VeryImportantException();
    }
    static void g() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args) {
        try{
            f();
            try{
                g();
            } finally {

            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
