package Ch13.Exercise;

import java.util.Random;

class Initable {
    static final int staticFinal1 = 47;
    static final int staticFinal2 =
            ClassInitialization.rand.nextInt();
    static {
        System.out.println("Initializing Initable");
    }
}



public class ClassInitialization {
    public static Random rand = new Random(53);
}
