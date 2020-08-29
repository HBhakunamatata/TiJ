package Ch17.Exercise;

/*
* Create a class called SortedDirList with a constructor
* that takes a File object and builds a sorted directory list
* from the files at that File.
* Add to this class two overloaded list() methods:
* the first produces the whole list, and the second produces
* the subset of the list that matches its argument
* (which is a regular expression).
*/

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

class SortedDirList {
    String [] list;

    public SortedDirList (File filePath) {
        list = filePath.list();
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
    }

    public String [] list() {
        return list;
    }

    public String [] list(String regex) {

        List<String> result = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);

        for (String filename : list) {
            if ( pattern.matcher(filename).matches() )
                result.add(filename);
        }
        return (String[]) result.toArray();
    }
}

public class Exercise02 {
    public static void main(String[] args) {
        SortedDirList sortedDirList = new SortedDirList(
                new File("./src/Ch17/Exercise") );
        System.out.println( Arrays.toString( sortedDirList.list() ) );
        // TODO
        // sortedDirList.list("D*.java");

    }
}
