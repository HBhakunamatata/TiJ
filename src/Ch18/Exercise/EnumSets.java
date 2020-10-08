package Ch18.Exercise;

import java.util.*;
import static Ch18.Exercise.AlarmPoints.*;
import static net.mindview.util.Print.print;


public class EnumSets {

    public static void main(String[] args) {
        EnumSet<AlarmPoints> enumSet = EnumSet.noneOf(AlarmPoints.class);
        enumSet.add(KITCHEN);

        enumSet = EnumSet.allOf(AlarmPoints.class);
        print(enumSet);
        enumSet.addAll(EnumSet.of(STAIR1, STAIR2, KITCHEN));
        print(enumSet);
        enumSet.removeAll(EnumSet.of(STAIR1, STAIR2, KITCHEN));
        print(enumSet);

        enumSet.removeAll(EnumSet.range(OFFICE1, OFFICE4));
        print(enumSet);


        /*
        Creates an enum set with the same element type
        as the specified enum set, initially containing
        all the elements of this type that are not
        contained in the specified set.
         */
        enumSet = EnumSet.complementOf(enumSet);
        print(enumSet);
    }
}
