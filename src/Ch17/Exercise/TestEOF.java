package Ch17.Exercise;

import java.io.*;

public class TestEOF {

    public static void main(String[] args) throws IOException {

        String filePath = Util.prefix + "TestEOF.java";
        DataInputStream in = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream(filePath)
                )
        );

        // readByte() only produces legitimate result, so it cannot detect the end of input.
        // Instead, you can use the available() method to find out how many more characters are available.
        while ( in.available() != 0 ) {
            System.out.print( (char) in.readByte() );
        }

    }
}