package Ch11.Exercise;

/*
    Show that OnOffSwitch.java can fail by
    throwing a RuntimeException inside the try block.
 */

public class Exercise14 extends OnOffSwitch {
    private static Switch sw = new Switch();

    public static void f() throws OnOffException1, OnOffException2 {
        throw new RuntimeException();
    }
    public static void main(String[] args) {
        try{
            sw.on();
            f();
            sw.off();
        }catch (OnOffException1 e){
            System.out.println("Catching an OnOffException1");
            sw.off();
        }catch (OnOffException2 e){
            System.out.println("Catching an OnOffException2");
            sw.off();
        }
    }
}
