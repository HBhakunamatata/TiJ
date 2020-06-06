package Ch11.Exercise;

import Ch02_Operator.Exercise.Exercise2;

public class Exercise15 {
    private static Switch sw = new Switch();

    public static void main(String[] args) {
        try{
            sw.on();
            Exercise14.f();
        }catch (OnOffException1 e){
            System.out.println("Catching an OnOffException1");
        }catch (OnOffException2 e){
            System.out.println("Catching an OnOffException2");
        }finally {
            sw.off();
        }
    }
}
