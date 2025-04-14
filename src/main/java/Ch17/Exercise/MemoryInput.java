package Ch17.Exercise;

import java.io.IOException;
import java.io.StringReader;

public class MemoryInput {

    public static void main(String[] args) throws IOException {

        String filePath = "./src/Ch17/Exercise/MemoryInput.java";
        // BufferedInputFile.java is defined previously.
        StringReader reader =
                new StringReader(new BufferedInputFile().read(filePath));

        int c;

        while ( (c = reader.read()) != -1 ) {
            System.out.print( (char) c );
        }

    }
}
