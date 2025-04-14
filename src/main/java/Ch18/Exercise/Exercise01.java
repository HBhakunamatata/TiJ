package Ch18.Exercise;

/*
 * Use a static import to modify TrafficLight.java
 * so you don’t have to qualify the enum instances.
 */

import static Ch18.Exercise.Signal.*;

public class Exercise01 {

    Signal color = Signal.GREEN;

    public void change () {
        switch (color) {
            case RED:
                color = Signal.GREEN;
                break;
            case GREEN:
                color = Signal.YELLOW;
                break;
            case YELLOW:
                color = Signal.RED;
                break;
        }
    }

    @Override
    public String toString() {
        return "LightColor is " + color;
    }

    public static void main(String[] args) {
        Exercise01 exercise = new Exercise01();
        for (int i = 0; i < 5; i++) {
            exercise.change();
            System.out.println(exercise);
        }
    }
}
