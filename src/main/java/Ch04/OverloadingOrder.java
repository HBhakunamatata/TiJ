package Ch04;

import static net.mindview.util.Print.*;

public class OverloadingOrder {
    static void func (int i, String s){
        print(i + " " + s);
    }
    static void func ( String s, int i){
        print(s + " " + i);
    }

    public static void main(String[] args) {

        func(10, "int first");
        func("string first", 10);
    }
}
