package Ch17.Exercise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

public class Transfer {

    private static String filePath = Util.prefix + "Transfer.java";
    private static String copyfilePath = Util.prefix + "Transfer_bak.java";


    public static void main(String[] args) throws Exception {

        FileChannel
                in = new FileInputStream(filePath).getChannel(),
                out = new FileOutputStream(copyfilePath).getChannel();
        in.transferTo(0, in.size(), out);

        // Or:
        // out.transferFrom(in, 0, in.size());

        in.close();
        out.close();
    }
}
