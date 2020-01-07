package Ch06;

import static net.mindview.util.Print.*;

// reference initialization with composition

class Soup {
    private String s;

    Soup () {
        s = "Constructed";
        print("Soup constructor");
    }

    @Override
    public String toString() {
        return s;
    }
}

public class Bath {
    private Soup soup;
    private String value1 = "value1"    /// when definition
                , value2, value3;
    private int level;

    Bath(){
        value2 = "value2";   // in the construvroe
        level = 22;
    }

    {value3 = "value3";}     // instance initialization

    @Override
    public String toString() {
        if( soup == null){
            soup = new Soup();      // lazy initialization
        }
        return
            "value1 = " + value1 + ", value2 = " + value2 +
            ", value3 = " + value3 + "\n" +
            "soup = " + soup + "\n" +
            "level = " + level + "\n";
    }

    public static void main(String[] args) {
        Bath bath = new Bath();
        print(bath);
    }
}
