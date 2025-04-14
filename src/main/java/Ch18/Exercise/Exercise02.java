package Ch18.Exercise;

/*
 * Instead of implementing an interface,
 * make next() a static method.
 * What are the benefits and drawbacks of this approach?
 */

import java.util.Random;

enum CartoonCharacter02 {
    SLAPPY, SPANKY, PUNCHY, SILLY, BOUNCY, NUTTY, BOB;

    private static Random random = new Random();

    public static CartoonCharacter02 next () {
        return values()[random.nextInt(values().length)];
    }
}


public class Exercise02 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(CartoonCharacter02.next());
        }
    }

}
