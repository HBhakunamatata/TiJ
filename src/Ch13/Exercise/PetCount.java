package Ch13.Exercise;

// Using instanceof.
import Ch13.Exercise.pets.*;
import java.util.*;
import static net.mindview.util.Print.*;

public class PetCount {
    static class PetCounter extends HashMap<String, Integer> {
        public void count(String type) {
            Integer quantity = get(type);
            if (quantity == null) {
                put(type, 1);
            } else {
                put(type, quantity + 1);
            }
        }
    }

    public static void countPet(PetCreator petCreator) {
        PetCounter petCounter = new PetCounter();
        for (Pet pet: petCreator.createArray(10)) {
            petCounter.count( pet.getClass().getSimpleName() );
        }
        print(petCounter);
    }

    public static void main(String[] args) {
        //
    }
}
