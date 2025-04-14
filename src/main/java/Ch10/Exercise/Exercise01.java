package Ch10.Exercise;

import java.util.ArrayList;
import java.util.List;

class Gerbil {
    private int gerbilNumber;
    Gerbil (int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public int hop() {
        return gerbilNumber;
    }
}

public class Exercise01 {
    public static void main(String[] args) {
        List<Gerbil> gerbils = new ArrayList<>();
        for (int i=0; i < 5; i++)
            gerbils.add(new Gerbil(i));
        for (int i = 0; i < gerbils.size(); i++) {
            System.out.println( "No." + gerbils.get(i).hop() + " Gerbil" );
        }
    }
}
