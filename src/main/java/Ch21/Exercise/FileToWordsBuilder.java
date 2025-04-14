package Ch21.Exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class FileToWordsBuilder {

    private boolean isBuilt = false;
    Stream.Builder<String> builder = Stream.builder();

    FileToWordsBuilder(String filePath) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filePath));
        lines.stream()
            .skip(1)
            .forEach( line -> {
                for (String s : line.split("[ .,?]+")) {
                    builder.add(s);
                }
            });
    }

    public Stream.Builder<String> add(List<String> contents) {
        if (isBuilt)
            throw new RuntimeException("builder hasn't been built");
        contents.stream()
            .forEach(line -> {
                for (String s : line.split("[ .,?]+")) {
                    builder.add(s);
                }
            });
        return builder;
    }

    public Stream<String> build () {
        return builder.build();
    }

    public static void main(String[] args) throws IOException {
        new FileToWordsBuilder("D:\\Test\\cheese.dat")
            .build()
            .limit(7)
            .map(s -> s + " ")
            .forEach(System.out::print);
    }
}

