package Ch13.Exercise;

// Use TypeCounter with the RegisteredFactories.java example in this chapter.

import net.mindview.util.TypeCounter;

public class Exercise13 {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Part.class);
        for (int i = 0; i < 10; i++) {
            Part temp = Part.createPart();
            System.out.println(temp);
            counter.count(temp);
        }
        System.out.println(counter);

    }

}
