package Ch13.Exercise;

/*
  Implement a new PetCreator using Registered Factories,
  and modify the Pets Facade so that it uses this one instead of the other two.
  Ensure that the rest of the examples that use Pets.Java still work correctly.
 */

import Ch13.Exercise.factory.Factory;
import Ch13.Exercise.pets.*;
import java.util.*;

class FactoryPetCreator extends PetCreator {
    private static List<Factory<? extends Pet>> types = new ArrayList<>();
    static void loader() {
        for (Class<? extends Pet> cc : LiteralPetCreator.allTypes) {
            types.add((Factory<? extends Pet>) () -> {
                try {
                    return cc.newInstance();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                return null;
            });
        }
    }
    static {
        loader();
    }
    public List<Class<? extends Pet>> types() {
        return LiteralPetCreator.allTypes;
    }
}

public class Exercise15 {
    public static void main(String[] args) {

    }
}
