package Ch13.Exercise;

import static net.mindview.util.Print.*;

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}

class Toy {
    // Toy() { }
    Toy(int i) { }
}

class FancyToy extends Toy
implements HasBatteries, Waterproof, Shoots {
    FancyToy() {
        super(1);
    }
}

public class ToyTest {
    public static void printInfo (Class cc) {
        print("Class name: " + cc.getName() +
                " is interface? [" + cc.isInterface() + "]");
        print("Simple name: " + cc.getSimpleName());
        print("Canonical name : " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;

        // Section 1
        try {
            c = Class.forName("Ch13.Exercise.FancyToy");
        } catch (ClassNotFoundException e) {
            print("Can not find FancyToy ...");
            System.exit(1);
        }
        printInfo(c);

        // Section 2
        for (Class face : c.getInterfaces())
            printInfo(face);

        // Section 3
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            obj = up.newInstance();
        } catch (InstantiationException e) {
            print("Cannot instantiate");
            System.exit(1);
        } catch (IllegalAccessException e) {
            print("Cannot access");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}
