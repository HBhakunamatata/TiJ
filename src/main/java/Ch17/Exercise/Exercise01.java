package Ch17.Exercise;

/*
 * Modify DirList.java (or one of its variants) so that
 * the FilenameFilter opens and reads each file
 * (using the net.mindview.util.TextFile utility) and
 * accepts the file based on whether any of the trailing
 * arguments on the command line exist in that file.
 */
import net.mindview.util.TextFile;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public class Exercise01 {
    public static FilenameFilter filter (final String path, final String regex) {
        return new FilenameFilter() {
            Pattern pattern = Pattern.compile(regex);
            @Override
            public boolean accept(File dir, String name) {
                TextFile fileNames = new TextFile(path);
                // fileNames.get(0);
                return pattern.matcher(name).matches();
            }
        };
    }

    public static void main(String[] args) {

        String path = "./src/Ch17/Exercise";
        File fileName = new File(path);

        String [] list;

        if (args[0].length() == 0)
            list = fileName.list();
        else
            list = fileName.list(filter(path, args[0]));


    }
}
