package Ch02_Operator.Exercise;

import static net.mindview.util.Print.*;
/*
 * This is a practice to show the alias.
 * when you assign a reference to another reference
 */

class Student{
    float point;
}

public class Exercise2 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2  = new Student();
        stu1.point = 1.1f;
        stu2.point = 2.2f;
        print("1: stu1.point = " + stu1.point +
                " ,stu2.point = " + stu2.point);
        stu2 = stu1;
        print("2: stu1.point = " + stu1.point +
                " ,stu2.point = " + stu2.point);
        stu1.point = 3.3f;
        print("3: stu1.point = " + stu1.point +
                " ,stu2.point = " + stu2.point);
        stu2.point = 4.4f;
        print("4: stu1.point = " + stu1.point +
                " ,stu2.point = " + stu2.point);
    }

}
