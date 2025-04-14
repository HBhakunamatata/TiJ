package Ch17.Exercise;

// Modify ProcessFiles.java so that it matches
// a regular expression rather than a fixed extension.

import net.mindview.util.Directory;
import net.mindview.util.ProcessFiles;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public class Exercise05 {

    interface Strategy {
        void process (File file);
    }

    private Strategy strategy;
    private String regex;

    Exercise05 (Strategy strategy, String regex) {
        this.strategy = strategy;
        this.regex = regex;
    }

    public void start (String filePath) {

        Pattern pattern = Pattern.compile(regex);

        for (File file : Directory.walk(filePath, regex).files) {
            if (pattern.matcher( file.getName() ).matches() )
                strategy.process(file);
        }
    }

//    public void processDirTree (File file) {
//
//    }

    public static void main(String[] args) {

        new Exercise05(new Strategy() {
            @Override
            public void process(File file) {
                System.out.println(file.getName());
            }
        }, "E.*\\.java").start("./src/Ch17/Exercise");

    }
}
