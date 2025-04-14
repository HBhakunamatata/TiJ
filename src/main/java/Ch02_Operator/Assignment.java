package Ch02_Operator;

/*
 * Assignment the object will be confused.
 */

import static net.mindview.util.Print.*;

class Tank {
    int level;
}

public class Assignment {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;
        print("1: t1.level = " + t1.level +
                " t2.level = " + t2.level);
        t1 = t2;
        print("2: t1.level = " + t1.level +
                " t2.level = " + t2.level);
        t1.level = 27;
        print("3: t1.level = " + t1.level +
                " t2.level = " + t2.level);
    }
}

/*
 * t1 and t2 both are  reference.
 * when t1 = t2 , t1 and t2 both point to the same object
 * By the way, after t1=t2, the origin object (t1 pointing to) will be released by _gc_.
 */