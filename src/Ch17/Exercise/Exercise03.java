package Ch17.Exercise;

/*
 * Modify DirList.java (or one of its variants) so that
 * it sums up the file sizes of the selected files.
 */

import java.io.File;

public class Exercise03 {

    public static long getFileSize(File filePath) {
        long size = 0L;

        if (filePath.isDirectory()){
            for (File subFile : filePath.listFiles()) {
                size += getFileSize(subFile);
            }
        }
        return filePath.length();
    }

    public static void main(String[] args) {
        File filePath = new File("./src/Ch17/Exercise");
        long resultSize = getFileSize(filePath);

        System.out.println(resultSize);
    }
}
