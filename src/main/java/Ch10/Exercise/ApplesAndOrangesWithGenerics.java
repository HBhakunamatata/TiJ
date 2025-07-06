package Ch10.Exercise;

import java.util.ArrayList;

public class ApplesAndOrangesWithGenerics {

    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();

        for(int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }

        // Turn Running-time Exception into Compile-time error:
        // apples.add(new Orange());

        for (Apple a : apples) {
            System.out.println( a.getId() );
        }
    }
}
