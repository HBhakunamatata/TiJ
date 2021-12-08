package Ch21.Exercise;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Generator implements Supplier<String> {

    private char [] alphabet =
        "ABCDEFIWJFLGNOWPIPKS".toCharArray();
    private static Random rand = new Random();
    @Override
    public String get() {
        return "" + alphabet[rand.nextInt(alphabet.length)];
    }

    public static void main(String[] args) {
        Stream.generate(new Generator())
            .limit(10)
            .forEach(System.out::print);
    }
}
