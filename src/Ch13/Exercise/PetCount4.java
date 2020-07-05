package Ch13.Exercise;

import Ch13.Exercise.pets.Pet;
import Ch13.Exercise.pets.Pets;
import net.mindview.util.TypeCounter;

public class PetCount4 {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Pet.class);
        for ( Pet pet : Pets.createList(20) ) {
            counter.count(pet);
        }
        System.out.println(counter);
    }

}
