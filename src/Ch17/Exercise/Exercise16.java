package Ch17.Exercise;

/*
 * Look up RandomAccessFile in the JDK documentation.
 * Starting with UsingRandomAccessFile.java,
 * create a program that stores and then retrieves all the
 * different possible types provided by the RandomAccessFile class.
 * Verify that the values are stored and retrieved accurately.
 */

import java.io.IOException;
import java.io.RandomAccessFile;

public class Exercise16 {

    static String file = Util.prefix + "Data2.txt";

    static void display() throws IOException {

        RandomAccessFile in = new RandomAccessFile(file, "r");

        System.out.println(in.readUTF());

        boolean b = in.readBoolean();
        byte bt = in.readByte();
        char c = in.readChar();
        int i = in.readInt();
        long l = in.readLong();
        short s = in.readShort();
        float f = in.readFloat();
        double d = in.readDouble();
        String str = in.readUTF();

        System.out.println(str);

        in.close();

    }

    static void write() throws IOException {

        RandomAccessFile out = new RandomAccessFile(file, "rw");

        out.writeUTF("The start of the file");
        out.writeBoolean(true);
        out.writeByte(56);
        out.writeChar('a');
        out.writeInt(56);
        out.writeLong(56l);
        out.writeShort(56);
        out.writeFloat(56f);
        out.writeDouble(3.14159);
        out.writeUTF("The end of the file");
        out.close();
    }
    public static void main(String[] args) throws IOException {
        write();
        display();
    }

}
