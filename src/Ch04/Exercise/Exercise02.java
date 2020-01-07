package Ch04.Exercise;

import static net.mindview.util.Print.*;

/*
 *  Create a class with a String field that is initialized at the point of definition,
 *  and another one that is initialized by the constructor.
 *  What is the difference between the two approaches?
 */

class Tank {
    int level = 0;

    Tank(int level){
        this.level = level;
    }

    @Override
    public String toString() {
        return "Tank{" +
                "level=" + level +
                '}';
    }
}

public class Exercise02 {
    public static void main(String[] args) {
        Tank t1 = new Tank(1);
        print(t1);
    }
}


/*
 * Initialisers are executed before constructor bodies.
 */