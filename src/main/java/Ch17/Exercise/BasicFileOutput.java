package Ch17.Exercise;

import java.io.*;

public class BasicFileOutput {
    public static void main(String[] args) throws IOException {

        String filePath = Util.prefix + "BasicFileOutput.java";
        String outFilePath = Util.prefix + "BasicFileOutput.out";

        BufferedReader reader = new BufferedReader(
                new StringReader(
                    new BufferedInputFile().read(filePath)
                )
        );

        PrintWriter writer = new PrintWriter(
                new BufferedWriter(
                        new FileWriter(outFilePath)
                )
        );

//        BufferedWriter writer =
//                new BufferedWriter(
//                        new FileWriter(outFilePath)
//                )
//        ;

        String s;
        int counter = 1;

        while ( (s = reader.readLine()) != null ) {
            // writer.write(counter++ + " : " + s);
            writer.println(counter++ + " : " + s);
        }

        // flush the memory
        writer.close();

    }
}
