package Ch14.Exercise;

import net.mindview.util.*;
import static net.mindview.util.Tuple.*;

public class TupleTest02 {

    static TwoTuple<String,Integer> f() {
        return tuple("hi", 47);
    }
    static TwoTuple f2() { return tuple("hi", 47); }
    static ThreeTuple<Automobile,String,Integer> g() {
        return tuple(new Automobile(), "hi", 47);
    }
    static
    FourTuple<Vehicle,Automobile,String,Integer> h() {
        return tuple(new Vehicle(), new Automobile(), "hi", 47);
    }
    static
    FiveTuple<Vehicle, Automobile,String,Integer,Double> k() {
        return tuple(new Vehicle(), new Automobile(),
            "hi", 47, 11.1);
    }

    public static void main(String[] args) {
        System.out.println(f());
        System.out.println(f2());
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
    }
}
