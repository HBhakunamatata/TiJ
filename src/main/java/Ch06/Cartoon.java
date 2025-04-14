package Ch06;

import static net.mindview.util.Print.*;

// Constructor calls during inheritance.

class Art {
    Art () {
        print("Art Constructor");
    }
}

class Drawing extends Art {
    Drawing () {
        print("Drawing Constructor");
    }
}

public class Cartoon extends Drawing{
    //Cartoon () { print("Cartoon Constructor"); }

    public static void main(String[] args) {
        Cartoon cartoon = new Cartoon();
    }
}
