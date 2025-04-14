package Ch15.Exercise;

import java.util.*;

public class ArraysOfGenerics {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        List<String> [] ls;
        List [] la = new List[10];  // "Unchecked" warning
        ls = (List<String>[]) la;

        ls[0] = new ArrayList<String>();
        // Compile-time checking produces an error:
        // ls[1] = new ArrayList<Integer>();

        // The problem: List<String> is a subtype of Object
        Object [] objects = ls;
        // Compiles and runs without complaint:
        objects[1] = new ArrayList<Integer>();


        List<BerylliumSphere> [] spheres;
        spheres = ( List<BerylliumSphere> []) new List [10];

        for (int i = 0; i < spheres.length; i++) {
            spheres[i] = new ArrayList<BerylliumSphere>();
        }

    }
}
