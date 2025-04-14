package Ch21.Exercise;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomWords implements Supplier<String> {

    private List<String> words;
    private Random rand;

    RandomWords (String fName) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(fName));
        for (String s : lines.subList(1, lines.size())) {
            for (String word : s.split("[ .,?]+")) {
                words.add(word.toLowerCase());
            }
        }
    }

    @Override
    public String get() {
        return words.get(rand.nextInt(words.size()));
    }

    @Override
    public String toString() {
        return words
            .stream()
            .collect(Collectors.joining(" "));
    }

    public static void
    main(String[] args) throws Exception {
        System.out.println(
            Stream.generate(new RandomWords("cheese.dat"))
                .limit(10)
                .collect(Collectors.joining(" "))
        );
    }
}
