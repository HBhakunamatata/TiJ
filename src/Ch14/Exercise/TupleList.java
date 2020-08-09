package Ch14.Exercise;

import net.mindview.util.*;
import java.util.*;

public class TupleList <A,B,C,D> extends ArrayList<FourTuple<A,B,C,D>> {
    public static void main(String[] args) {
        TupleList<Vehicle, Automobile, String, Integer>
                tupleList = new TupleList<>();
        tupleList.add(TupleTest.h());
        tupleList.add(TupleTest.h());
        System.out.println(tupleList);
    }
}
