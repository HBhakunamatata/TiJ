package Ch13.Exercise;

import static net.mindview.util.Print.*;

class Candy {
    static {
        print("Loading Candy ...");
    }
}

class Gum {
    static {
        print("Loading Gum ...");
    }
}

class Cookie {
    static {
        print("Loading Cookie ...");
    }
}

public class SweetShop {
    public static void main(String[] args) {
        print("Inside main ...");
        new Candy();
        try {
            Class.forName("Gum");
        } catch (ClassNotFoundException e) {
            print("Can not find Gum.class ...");
        }
        print("After creating Gum ...");

        new Cookie();
        print("After creating Cookie ...");
    }
}
