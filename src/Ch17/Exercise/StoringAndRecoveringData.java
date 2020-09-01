package Ch17.Exercise;

import java.io.*;

public class StoringAndRecoveringData {

    public static void main(String[] args) throws IOException {

        String outPath = Util.prefix + "data.txt";

        DataOutputStream out = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(outPath)
                )
        );

        out.writeUTF("Here is a Double:");
        out.writeDouble(1.1F);
        out.writeUTF("That was pi:");
        out.writeDouble(3.14159);

        out.close();

        DataInputStream in = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream(outPath)
                )
        );

        System.out.println(in.readUTF());
        System.out.println(in.readDouble());
        System.out.println(in.readUTF());
        System.out.println(in.readDouble());

    }
}
