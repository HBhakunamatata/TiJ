package Ch14.Exercise;

/*
  Use Holders with the typeinfo.pets library to show that a Holders
  that is specified to hold a base type can also hold a derived type.
 */

import Ch13.Exercise.pets.*;

public class Exercise01 {
    public static void main(String[] args) {
        Holder3 <Pet> petHolder3 = new Holder3<>(new Dog());
        Dog petDog = (Dog) petHolder3.get();
    }
}
