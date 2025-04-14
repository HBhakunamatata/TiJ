package Ch18.Exercise;

import net.mindview.util.Generator;

import java.util.Random;

enum CartoonCharacter
        implements Generator<CartoonCharacter> {

    SLAPPY, SPANKY, PUNCHY, SILLY, BOUNCY, NUTTY, BOB;

    private Random random = new Random();

    @Override
    public CartoonCharacter next() {
        return values()[random.nextInt(values().length)];
    }
}

public class EnumImplementation {

    public static <T> void printNext(Generator <T> generable) {
        System.out.print(generable.next() + ", ");
    }

    public static void main(String[] args) {
        CartoonCharacter cc = CartoonCharacter.BOB;
        for (int i = 0; i < 5; i++) {
            printNext(cc);
        }
    }
}
