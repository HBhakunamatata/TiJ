package Ch17.Exercise;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

public class FormattedMemoryInput {

    public static void main(String[] args) throws IOException {

        String filePath = "./src/Ch17/Exercise/FormattedMemoryInput.java";

        try {
            DataInputStream in = new DataInputStream(
                    new ByteArrayInputStream(
                            new BufferedInputFile().read(filePath).getBytes("utf-8")
                    )
            );

            while (true) {
                System.out.print( (char) in.readByte() );
            }

        } catch (EOFException e) {
            e.printStackTrace();
        }

    }

}
