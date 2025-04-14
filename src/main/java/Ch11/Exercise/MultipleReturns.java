package Ch11.Exercise;

import static net.mindview.util.Print.*;

public class MultipleReturns {
    public static void f(int i) {
        print("Initialization that requires cleanup");
        try{
            print("Point 1");
            if(1 == i) return;
            print("Point 2");
            if(2 == i) return;
            print("Point 3");
            if(3 == i) return;
            print("end");
        }finally {
            print("Perform cleanup");
        }

    }

    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            f(i);
        }
    }
}
