package Ch21.Exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileToWordsRegexp {
    private String all;

    FileToWordsRegexp(String filePath) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filePath));
        all = lines.stream()
            .skip(1)
            .collect(Collectors.joining(" "));
    }

    public Stream<String> stream() {
        return Pattern.compile("[ .,?]+").splitAsStream(all);
    }

    public static void main(String[] args) throws IOException {
        new FileToWordsRegexp("D:\\Test\\cheese.dat")
            .stream()
            .map(s -> s + " ")
            .limit(7)
            .forEach(System.out::print);
    }
}
