package Ch14.Exercise;

import net.mindview.util.*;

class Vehicle { }

public class TupleTest {

    static TwoMemTuple <String, Integer> f() {
        return new TwoMemTuple<>("abc", 12);
    }
    static ThreeMemTuple <Vehicle, String, Integer> g() {
        return new ThreeMemTuple<>(new Vehicle(), "abc", 12);
    }
    static FourTuple<Vehicle,Automobile,String,Integer> h() {
        return new FourTuple<Vehicle,Automobile,String,Integer>(
            new Vehicle(), new Automobile(), "hi", 47);
    }
    static FiveTuple<Vehicle,Automobile,String,Integer,Double> k() {
        return new FiveTuple<Vehicle,Automobile,String,Integer,Double>(
            new Vehicle(), new Automobile(), "hi", 47, 11.1);
    }

    public static void main(String[] args) {
        TwoMemTuple<String,Integer> ttsi = f();
        System.out.println(ttsi);
        // ttsi.first = "there"; // Compile error: final
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
    }
}
