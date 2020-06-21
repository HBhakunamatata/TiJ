package Ch13.Exercise;

import java.util.Random;

class Initable {
    static final int staticFinal1 = 1;
    static final int staticFinal2 =
            ClassInitialization.rand.nextInt();
    static {
        System.out.println("Initializing Initable");
    }
}

class Initable2 {
    static int staticNonFinal = 2;
    static {
        System.out.println("Initialing Initable2");
    }
}

class Initable3 {
    static int staticNonFinal = 3;
    static {
        System.out.println("Initialing Initable3");
    }
}

public class ClassInitialization {
    public static Random rand = new Random(53);

    public static void main(String[] args) {
        // Creating a ref of Initable. Does not trigger the initialization
        Class cc = Initable.class;

        // Does not trigger the initialization
        System.out.println(Initable.staticFinal1);
        // Does trigger the initialization
        System.out.println(Initable.staticFinal2);
        // Does trigger the initialization
        System.out.println(Initable2.staticNonFinal);

        // Does trigger the initialization
        try {
            Class cc2 = Class.forName("Ch13.Exercise.Initable3");
            System.out.println("After creating Initable3 ref");
            System.out.println(Initable3.staticNonFinal);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
