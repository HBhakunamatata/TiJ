package Ch17.Exercise;

/*
 * Using BinaryFile and a Map<Byte,Integer>,
 * create a program that counts the occurrence
 * of all the different bytes in a file.
 */


import net.mindview.util.BinaryFile;

import java.io.IOException;
import java.util.HashMap;

class ByteCounter extends HashMap <Byte, Integer> {

    public ByteCounter (String fileName) {
        initMap(Util.prefix + fileName);
    }
    
    public void initMap(String filePath) {

        try {
            byte[] bytes = BinaryFile.read(filePath);
            
            for (byte b : bytes) {
                if (this.containsKey(b))
                    this.put(b, this.get(b) + 1);
                else
                    this.put(b, 1);
            }
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


public class Exercise19 {

    public static void main(String[] args) {
        System.out.println(new ByteCounter("Exercise19.java"));
    }

}
