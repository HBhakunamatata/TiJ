package Ch12.Exercise;

/*
  Analyze SprinklerSystem.toString() in reusing/SprinklerSystem.java
  to discover whether writing the toString() with an explicit StringBuilder
  will save any StringBuilder creations.
 */

import Ch01.Exercise.Exercise1;

public class Exercise01 {
    class WaterSource {
        String info;
        WaterSource(){
            info = "Constructed ..";
        }

        @Override
        public String toString() {
            return info;
        }
    }

    class SprinklerSystem {
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

            StringBuilder s = new StringBuilder();
            s.append("value1 = ").append(value1).append("\n");
            s.append("value2 = ").append(value2).append("\n");
            s.append("watersource = ").append(waterSource).append("\n");
            s.append("level = ").append(level).append("\n");
            s.append("anInt = ").append(anInt).append("\n");
            return s.toString();
        }
    }

    public SprinklerSystem getSprinkSysytem(){
        return new SprinklerSystem();
    }

    public static void main(String[] args) {
        Exercise01 exercise01 = new Exercise01();
        System.out.println(exercise01.getSprinkSysytem());
    }

}
