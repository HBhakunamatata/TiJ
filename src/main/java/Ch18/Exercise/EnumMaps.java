package Ch18.Exercise;

import java.util.EnumMap;
import java.util.Map;

import static Ch18.Exercise.AlarmPoints.*;
import static net.mindview.util.Print.*;

interface Command { void action(); }

public class EnumMaps {

    public static void main(String[] args) {
        EnumMap<AlarmPoints, Command> map = new EnumMap<>(AlarmPoints.class);
        map.put(BATHROOM, new Command() {
            @Override
            public void action() {
                System.out.println("Bathroom water");
            }
        });

        map.put(KITCHEN, new Command() {
            @Override
            public void action() {
                System.out.println("Kitchen fire");
            }
        });

        for (Map.Entry<AlarmPoints, Command> entry : map.entrySet()) {
            printnb(entry.getKey());
            entry.getValue().action();
        }

        try {
            map.get(UTILITY).action();
        } catch (Exception e ) {
            print(e);
        }

    }

}
