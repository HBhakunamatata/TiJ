package Ch17.Exercise;


/*
 * Look up DataOutputStream and DataInputStream
 * in the JDK documentation.
 * Starting with StoringAndRecoveringData.java,
 * create a program that stores and then retrieves
 * all the different possible types provided by the
 * DataOutputStream and DataInputStream classes.
 * Verify that the values are stored and retrieved accurately.
 */

import java.io.*;

public class Exercise15 {

    public static void main(String[] args) throws IOException {

        String dataPath = Util.prefix + "Exercise15.dat";

        DataOutputStream out = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(dataPath)
                )
        );

        out.writeUTF("Here is an example");
        out.writeInt(324);
        // out.writeChars("chars[]");
        // out.writeBytes("ssssss");

        out.close();

        DataInputStream in = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream(dataPath)
                )
        );

        System.out.println(in.readUTF());
        System.out.println(in.readInt());


    }
}
