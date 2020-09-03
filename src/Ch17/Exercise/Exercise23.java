package Ch17.Exercise;

// Create and test a utility method to print the
// contents of a CharBuffer up to the point
// where the characters are no longer printable.

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Exercise23 {

    private String filePath;
    private final static int SIZE = 1024;

    public Exercise23 () {
        filePath = Util.prefix + "Exercise23.dat";
    }

    public Exercise23 (String filePath) {
        this.filePath = filePath;
    }

    public void read () {

        try {
            FileChannel channel =
                    new FileInputStream(filePath).getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(SIZE);

            while (channel.read(buffer) != -1) {
                buffer.flip();
                System.out.println(buffer.asCharBuffer());
                buffer.clear();
            }

            channel.close();
            // channel.write(ByteBuffer.wrap(""))
            
        } catch ( IOException e) {
            e.printStackTrace();
        }
    }

    public void write () {
        try {
            FileChannel channel =
                    new FileOutputStream(filePath).getChannel();

            channel.write(ByteBuffer.wrap(
                    "Some text .. \n".getBytes("utf-16")));

            ByteBuffer buffer = ByteBuffer.allocate(SIZE);
            buffer.asCharBuffer().put("put String using charbuffer\n");
            channel.write(buffer);
            //buffer.rewind();
            buffer.asCharBuffer().put("put String02 using charbuffer\n");
            channel.write(buffer);

            channel.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        Exercise23 exercise = new Exercise23();
        exercise.write();
        exercise.read();
    }
}
