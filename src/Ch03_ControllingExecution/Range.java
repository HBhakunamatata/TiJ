package Ch03_ControllingExecution;

import static net.mindview.util.Print.*;
import static net.mindview.util.Range.*;

public class Range {

    public static void main(String[] args) {
        for (int i : range(1,10, 2)
             ) {
            printnb(i + " ");
        }
    }
}
