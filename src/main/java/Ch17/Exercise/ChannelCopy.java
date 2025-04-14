package Ch17.Exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelCopy {

    private static final int BSIZE = 1024;
    private static String filePath = Util.prefix + "ChannelCopy.java";
    private static String copyfilePath = Util.prefix + "ChannelCopy_bak.java";

    public static void main(String[] args) throws Exception{

        FileChannel
                in = new FileInputStream(filePath).getChannel(),
                out = new FileOutputStream(copyfilePath).getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(BSIZE);

        while (in.read(buffer) != -1){
            buffer.flip();
            out.write(buffer);
            buffer.clear();
        }

        in.close();
        out.close();

    }

}
