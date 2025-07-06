package Ch10.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Snow {}
class Powder extends Snow {}
class Light extends Powder {}
class Heavy extends Powder {}
class Crusty extends Snow {}
class Slush extends Snow {}

public class AsListInference {

    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList( new Powder(), new Crusty(), new Slush() );

        List<Snow> snow2 = Arrays.asList( new Light(), new Heavy() );

        List<Snow> snow3 = new ArrayList<>();
        Collections.addAll(snow3, new Light(), new Heavy(), new Powder());
        snow3.add(new Slush());

        List<Snow> snow4 = Arrays.<Snow>asList( new Light(), new Heavy() );
        try {
            snow4.add(new Slush());
        } catch (Exception e) {
            if (e instanceof UnsupportedOperationException) {
                e.printStackTrace();
            }
        }

    }
}
