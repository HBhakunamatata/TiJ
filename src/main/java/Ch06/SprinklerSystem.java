package Ch06;

import static net.mindview.util.Print.*;

//  Composition for code reuse.

class WaterSource {
    String info;
    WaterSource(){
        info = "Constructed ..";
        print("Water Source Constructor");
    }

    @Override
    public String toString() {
        return info;
    }
}

public class SprinklerSystem {
    String value1, value2;
    WaterSource waterSource;
    float level;
    int anInt;

    SprinklerSystem() {
        waterSource = new WaterSource();
        value1 = "value1";
    }

    @Override
    public String toString() {
        return
            "value1 = " + value1 + ", value2 = " + value2 + "\n" +
            "watersource = " + waterSource + "\n" +
            "level = " + level + "\n" +
            "anInt = " + anInt;
    }

    public static void main(String[] args) {
        SprinklerSystem sprinklerSystem = new SprinklerSystem();
        print(sprinklerSystem);
    }
}
