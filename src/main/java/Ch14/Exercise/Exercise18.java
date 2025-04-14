package Ch14.Exercise;

/*
 * Following the form of BankTeller.java,
 * create an example where BigFish eat LittleFish in the Ocean.
 */

import net.mindview.util.*;
import java.util.*;

class BigFish {
    private static int counter = 0;
    private final int id = counter++;

    private BigFish () {}

    @Override
    public String toString() {
        return "BigFish{" + id + '}';
    }

    public static Generator <BigFish> generator() {
        return new Generator<BigFish>() {
            @Override
            public BigFish next() {
                return new BigFish();
            }
        };
    }
}

class LittleFish {
    private static int counter = 0;
    private final int id = counter++;

    private LittleFish () {}

    @Override
    public String toString() {
        return "LittleFish{" + id + '}';
    }

    public static Generator <LittleFish>
        generator = new Generator<LittleFish>() {
        @Override
        public LittleFish next() {
            return new LittleFish();
        }
    };
}

public class Exercise18 {

    public static void oceanEat (BigFish bigFish, LittleFish littleFish) {
        System.out.println(
                bigFish + " eats " + littleFish
        );
    }


    public static void main(String[] args) {
        List <BigFish> bigFishList = new ArrayList<>();
        Generators.fill(bigFishList, BigFish.generator(), 5);
        
        Set <LittleFish> littleFishSet = new HashSet<>();
        Generators.fill(littleFishSet, LittleFish.generator, 20);

        for (LittleFish little : littleFishSet) {
            oceanEat(bigFishList.get(new Random().nextInt(bigFishList.size())), little);
        }
        
    }
}
