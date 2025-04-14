package Ch13.Exercise;

import net.mindview.util.Null;

import java.lang.reflect.*;
import java.util.Collections;
import java.util.List;

class NullRobotHandler implements InvocationHandler {

    private String  nullName;
    private Robot proxied = new NullRobot();

    public NullRobotHandler (Class <? extends Robot> type) {
        nullName = type.getSimpleName() + " NullRobot";
    }

    private class NullRobot implements Robot {

        @Override
        public String name() {
            return nullName;
        }

        @Override
        public String model() {
            return nullName;
        }

        @Override
        public List<Operation> operations() {
            return Collections.emptyList();
        }
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(proxied, args);
    }
}

public class NullRobot {

    public static Robot newNullRobot (Class <? extends Robot> type) {
        return (Robot)Proxy.newProxyInstance(
                NullRobot.class.getClassLoader(),
                new Class[] {Null.class, Robot.class},
                new NullRobotHandler(type)
        );
    }

    public static void main(String[] args) {
        Robot [] robots = {
                new SnowRemovalRobot("SnowBee"),
                newNullRobot(SnowRemovalRobot.class)
        };
        for (Robot ro : robots)
            Robot.Test.test(ro);
    }

}
