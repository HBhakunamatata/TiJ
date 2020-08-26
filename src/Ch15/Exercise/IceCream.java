package Ch15.Exercise;

import java.util.*;

public class IceCream {

    private static Random random = new Random();

    static String [] FLAVORS = {
            "Chocolate", "Strawberry", "Vanilla Fudge Swirl",
            "Mint Chip", "Mocha Almond Fudge", "Rum Raisin",
            "Praline Cream", "Mud Pie"
    };

    public static String [] setFlavor (int n) {
        String [] result = new String [n];
        boolean [] checked = new boolean [n];

        for (int x = 0; x < n; x++) {
            int i;
            do{
                i = random.nextInt(n);
            } while (checked[i]);
            result[i] = FLAVORS[random.nextInt(n)];
            checked[i] = true;
        }

        return result;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(setFlavor(3)));
        }
    }
}
