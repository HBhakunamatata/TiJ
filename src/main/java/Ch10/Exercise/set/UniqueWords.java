package Ch10.Exercise.set;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @description:
 * @author: Mr.Han
 * @create: 2025-07-05 16:29
 */

public class UniqueWords {

    public static void main(String[] args) throws IOException {
        String filePath = System.getProperty("user.dir") + "\\src\\main\\java\\Ch10\\Exercise\\set\\SetOperations.java";
        List<String> lines = Files.readAllLines(Paths.get(filePath));
//        Set<String> words = new TreeSet<>();
        Set<String> words = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        for (String line : lines) {
            for (String word : line.split("\\W+") ) {
                if (word.trim().length() > 0) {
                    words.add(word);
                }
            }
        }
        System.out.println(words);
    }

}
