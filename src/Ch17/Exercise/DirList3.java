package Ch17.Exercise;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList3 {

    public static void main(String[] args) {
        File filePath = new File("./src/Ch17/Exercise");
        String [] list;
        if (args.length == 0)
            list = filePath.list();
        else
            list = filePath.list(new FilenameFilter() {

                Pattern pattern = Pattern.compile(args[0]);
                @Override
                public boolean accept(File dir, String name) {
                    return pattern.matcher(name).matches();
                }
            });

        Arrays.sort(list, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(list));
    }
}
