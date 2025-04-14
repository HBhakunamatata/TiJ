package Ch21.Exercise;

import java.io.IOException;

public class Peeking {
    public static void main(String[] args) throws IOException {
        new FileToWordsRegexp("D:\\Test\\cheese.dat")
            .stream()
            .skip(21)
            .limit(5)

            .map(i -> i + " ")
            .peek(System.out::print)

            .map(i -> i.toUpperCase())
            .peek(System.out::print)

            .map(i -> i.toLowerCase())
            .forEach(System.out::print);
    }
}
