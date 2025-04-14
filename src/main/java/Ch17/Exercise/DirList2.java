package Ch17.Exercise;

import java.io.*;
import java.util.Arrays;
import java.util.regex.*;

public class DirList2 {

    public static FilenameFilter filter(String regex) {
        return new FilenameFilter() {

            Pattern pattern = Pattern.compile(regex);

            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        };
    }

    public static void main(String[] args) {
        File filePath = new File("./src/Ch17/Exercise");
        String [] list;
        if (args.length == 0)
            list = filePath.list();
        else
            list = filePath.list(filter(args[0]));

        Arrays.sort(list, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(list));

    }
}
