package Ch11.Exercise;

public class WithFinally {
    private static Switch sw = new Switch();

    public static void main(String[] args) {
        try{
            sw.on();
            OnOffSwitch.f();
        }catch (OnOffException1 e){
            System.out.println("Catching an OnOffException1");
        }catch (OnOffException2 e){
            System.out.println("Catching an OnOffException2");
        }finally {
            sw.off();
        }
    }
}
