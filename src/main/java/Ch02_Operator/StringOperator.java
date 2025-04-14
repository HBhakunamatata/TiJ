package Ch02_Operator;

import static net.mindview.util.Print.*;

public class StringOperator {
    public static void main(String[] args) {
        int x = 0, y = 1, z = 2;
        String s = "x, y, z ";

        print(s + x + y + z);   // Convert x, y, z to String
        print(s + (x+y+z) );

        print(x + y + " " + s);     // Convert since meeting the "" (partly wrong:run in order)

        print("" + x);          // shorthand of " Interger.toString()"
    }
}
