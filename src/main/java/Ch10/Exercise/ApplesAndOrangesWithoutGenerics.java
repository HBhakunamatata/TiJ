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
    public static void main(String[] args) throws Exception{
        ArrayList apples = new ArrayList();
        for( int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }

        // Not prevented from adding an Orange to apples:
        apples.add(new Orange());

        for (int i = 0; i < apples.size(); i++) {
            ((Apple)apples.get(i)).getId();
            // Orange is detected only at run time
        }
    }
}
