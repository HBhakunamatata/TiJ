package Ch17.Exercise;

/*
 * Using Directory.walk() and BinaryFile, verify that
 * all .class files in a directory tree begin with
 * the hex characters ‘CAFEBABE’.
 */

import net.mindview.util.BinaryFile;
import net.mindview.util.Directory;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise20 {

    public static void main(String[] args) {

        try{
            List<File> fileList =
                    Directory.walk(Util.classPrefix, ".*\\.class").files;

            for (File file : fileList) {
                byte[] bytes = BinaryFile.read(file);
                String s = "";

                // byte --> int --> 位运算去除多余位 --> hexString --> 截取最后两位(一共8位)
                for (int i = 0; i < 4; i++) {
                    s += Integer.toHexString(
                            (((Byte) bytes[i]).intValue() & 0x000000FF) | 0xFFFFFF00
                    ).substring(6);
                }

                System.out.println(s);
            }

        } catch (IOException e)  {
            e.printStackTrace();
        }
    }
}
