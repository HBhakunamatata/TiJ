package Ch13.Exercise;

import java.util.*;

/*
  A constructor is a kind of factory method.
  Modify RegisteredFactories.java so that instead of using an explicit factory,
  the class object is stored in the List, and newlnstance() is used to create each object.
 */
class Part01 {
    private static List<Class<? extends Part>> partClasses =
            new ArrayList<>();
    static {
        partClasses.add(FuelFilter.class);
        partClasses.add(AirFilter.class);
        partClasses.add(CabinAirFilter.class);
        partClasses.add(OilFilter.class);
        partClasses.add(FanBelt.class);
        partClasses.add(PowerSteeringBelt.class);
        partClasses.add(GeneratorBelt.class);
    }
    private static Random random = new Random();
    public static Part createPart() {
        int n = random.nextInt(partClasses.size());
        try {
            return partClasses.get(n).newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
public class Exercise14 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Part01.createPart());
        }
    }
}
