package Ch17.Exercise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class GetChannel {

    private static final int SIZE = 1024;
    private static String filePath = Util.prefix + "ChannelData.txt";

    public static void main(String[] args) throws Exception {

        FileChannel channel =
                new FileOutputStream(filePath).getChannel();
        channel.write(ByteBuffer.wrap(
                "Channel write OutputStream\n".getBytes("utf-8")));
        channel.close();


        channel = new RandomAccessFile(filePath, "rw").getChannel();
        // Move to the end of file
        channel.position(channel.size());
        channel.write(ByteBuffer.wrap(
                "Channel write Random".getBytes("utf-8")));
        channel.close();


        channel = new FileInputStream(filePath).getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(SIZE);
        channel.read(buffer);
        buffer.flip();
        while (buffer.hasRemaining()) {
            System.out.print((char) buffer.get());
        }
        buffer.clear();
        channel.close();

    }
}
