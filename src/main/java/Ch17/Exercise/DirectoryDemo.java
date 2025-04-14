package Ch17.Exercise;

import java.io.*;
import net.mindview.util.*;
import static net.mindview.util.Print.print;

public class DirectoryDemo {

    public static void main(String[] args) {
        PPrint.pformat(Directory.walk(".").dirs);
        
        for (File file : Directory.local("./src/Ch17/Exercise", "E.*")) {
            print(file);
        }

        print("----------------------");

        for (File file : Directory.walk("./src/Ch17/Exercise", "E.*\\.java")) {
            print(file);
        }

        print("----------------------");

        for(File file : Directory.walk("./out/production/tiJ/Ch14/Exercise",".*[Zz].*\\.class"))
            print(file);
    }
}
