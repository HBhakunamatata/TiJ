package Ch02_Operator.Exercise;

/*
 * Exercise 4:
 * Target: use the math operator
 * (2) Write a program that calculates velocity
 * using a constant distance and aconstant time.
 */

import java.util.Random;
import static net.mindview.util.Print.*;

public class Exercise4 {
    public static void main(String[] args) {
        Random rand = new Random();
        double velocity = 0.0,
                distance  = rand.nextDouble(),
                time = rand.nextDouble();
        velocity = distance / time;
        print("time = " + time + " , distance = " + distance + " , and the valicoty = " + velocity);
    }
}
