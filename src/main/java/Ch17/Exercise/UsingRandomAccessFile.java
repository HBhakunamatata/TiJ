package Ch17.Exercise;

import java.io.IOException;
import java.io.RandomAccessFile;

public class UsingRandomAccessFile {

    static String filePath = Util.prefix + "rtest.dat";

    public static void display () throws IOException {
        RandomAccessFile raf = new RandomAccessFile(filePath, "r");
        for (int i = 0; i < 7; i++) {
            System.out.println("Value " + i + ": " + raf.readDouble());
        }
    }

    public static void main(String[] args) {

        try {
            RandomAccessFile raf = new RandomAccessFile(filePath, "rw");
            for (int i = 0; i < 7; i++) {
                raf.writeDouble(i * 1.414);
            }
            raf.writeUTF("The end of the file");
            raf.close();
            display();

            raf = new RandomAccessFile(filePath, "rw");
            raf.seek(5 * 8);  // fifth * 8 bit(1 Byte)
            raf.writeDouble(41.002);
            raf.close();
            display();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
