package Ch13.Exercise;

/*
  Implement a new PetCreator using Registered Factories,
  and modify the Pets Facade so that it uses this one instead of the other two.
  Ensure that the rest of the examples that use Pets.Java still work correctly.
 */

import Ch13.Exercise.pets.*;

public class Exercise15 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(FactoryPetCreator.createPet());
        }
    }
}
