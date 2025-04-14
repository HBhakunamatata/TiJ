package Ch11.Exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputFile {
    private BufferedReader br;

    public InputFile(String filePath) throws Exception{
        try {
            br = new BufferedReader(new FileReader(filePath));
        } catch (FileNotFoundException e) {
            System.out.println("Can not open file : " + filePath);
            throw e;
        } catch (Exception e) {
            try {
                br.close();
            } catch (Exception e2) {
                System.out.println("Close file unsuccessfully");
                e2.printStackTrace();
            }
            throw e;
        } finally {

        }
    }

    public String getLine() {
        String s;
        try {
            s = br.readLine();
        } catch (IOException e1) {
            throw new RuntimeException("ReadLine() failed");
        }
        return s;
    }

    public void dispose() {
        try {
            br.close();
            System.out.println("Close file successfully");
        } catch (IOException e) {
            throw new RuntimeException("Close file failed");
        }
    }

}
