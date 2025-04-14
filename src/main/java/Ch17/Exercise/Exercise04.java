package Ch17.Exercise;

/*
 * Use Directory.walk() to sum the sizes of all files in a
 * directory tree whose names match a particular regular expression.
 */

import net.mindview.util.Directory;

import java.io.File;

public class Exercise04 {

    public static void main(String[] args) {
        long totalSize = 0L;

        Directory.TreeInfo walkReuslt = Directory.walk(
                "./src/Ch17/Exercise", "E.*\\.java"
        );

        for (File file : walkReuslt.files) {
            totalSize += file.length();
        }

        System.out.println("result size = " + totalSize);
    }
}
