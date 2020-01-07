package Ch02_Operator.Exercise;

/*
 * Exercise 3:
 * Target : see the aliasing of an object when calling the methods
 * (1) Create a class containing a float
 * and use it to demonstrate aliasing during method calls.
 */
import static net.mindview.util.Print.*;

class Tank{
    float level;
}
public class Exercise3 {
    static void f(Tank tank){
        tank.level  = 2f;
    }

    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.level = 1f;
        print("1. tank:level = " + tank.level);
        f(tank);
        print("2. tank:level = " + tank.level);

    }
}
