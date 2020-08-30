package Ch17.Exercise;

// Use ProcessFiles to find all the Java source-code
// files in a particular directory subtree
// that have been modified after a particular date.

import net.mindview.util.ProcessFiles;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise06 {

    public static void main(String[] args) {
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
        Date date;
        try {
             date = ft.parse("2020-08-28");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        new ProcessFiles((file) -> {
            if (new Date(file.lastModified()).after(date)) {
                System.out.println(file.getName());
            }
            System.out.println(file.getName());
        }, "java").start(new String[]{"./src/Ch15/Exercise"});
    }
}
