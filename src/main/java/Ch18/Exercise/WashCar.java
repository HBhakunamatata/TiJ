package Ch18.Exercise;

import java.util.EnumSet;

import static net.mindview.util.Print.*;

public class WashCar {
    public enum Cycle {

        UNDERBODY {
        void action() { print("Spraying the underbody"); }
        },
        WHEELWASH {
        void action() { print("Washing the wheels"); }
        },
        PREWASH {
        void action() { print("Loosening the dirt"); }
        },
        BASIC {
        void action() { print("The basic wash"); }
        },
        HOTWAX {
        void action() { print("Applying hot wax"); }
        },
        RINSE {
        void action() { print("Rinsing"); }
        },
        BLOWDRY {
        void action() { print("Blowing dry"); }
        };

        abstract void action ();
    }

    EnumSet <Cycle> cycle = EnumSet.of(Cycle.RINSE, Cycle.HOTWAX);

    public void washCar () {
        for (Cycle c : cycle) {
            c.action();
        }
    }

    public void add (Cycle c) {
        cycle.add(c);
    }

    @Override
    public String toString() {
        return cycle.toString();
    }

    public static void main(String[] args) {
        WashCar wash = new WashCar();
        wash.add(Cycle.BLOWDRY);
        wash.add(Cycle.BLOWDRY); // Duplicates ignored
        wash.add(Cycle.RINSE);
        wash.add(Cycle.HOTWAX);

        print(wash);
        wash.washCar();

    }
}
