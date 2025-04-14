package Ch21.Exercise;

import java.util.Comparator;

public class SortedComparator {
    public static void main(String[] args) throws Exception {
        FileToWords.stream("D:\\Test\\cheese.dat")
            .skip(10)
            .limit(10)
            .sorted(Comparator.reverseOrder())
            .map(w -> w + " ")
            .forEach(System.out::print);
    }
}
