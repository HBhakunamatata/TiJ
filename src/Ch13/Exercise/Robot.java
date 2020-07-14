package Ch13.Exercise;

import java.util.List;

public interface Robot {
    String name();
    String model();
    List<Operation> operations();

    class Test {
        public static void test(Robot robot) {
            System.out.println(robot.name());
            System.out.println(robot.model());
            for (Operation op : robot.operations()
                 ) {
                System.out.println( op.describtion() );
                op.command();
            }
        }
    }
}
