package Ch10.Exercise;

import java.util.ArrayList;

class Apple {
    private static long counter;
    private final long id = counter++;

    public long getId() {
        return id;
    }
}

class Orange {

}

public class ApplesAndOrangesWithoutGenerics {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for( int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }

        // Not prevented from adding an Orange to apples:
        apples.add(new Orange());

        for (Object apple : apples) {
            ((Apple)apple).getId();
            // Orange is detected only at run time
        }
    }
}
