package Ch14.Exercise;

// Add a SixTuple to Tuple.java, and test it in TupleTest2.java.

import Ch14.Exercise.Exercise03;

public class Exercise16 {

    static <A, B, C, D, E, F> Exercise03.SixTuple<A, B, C, D, E, F>
    tuple (A a, B b, C c, D d, E e, F f){
        Exercise03 exercise = new Exercise03();
        return exercise.new SixTuple<A, B, C, D, E, F>(a, b, c, d, e, f);
    }

    static Exercise03.SixTuple<Vehicle, Automobile, String, Integer, Double, Character>
    f6 () {
        return tuple(new Vehicle(), new Automobile(), "hi", 47, 11.1, 'c');
    }

    public static void main(String[] args) {
        System.out.println(f6());
    }



}
