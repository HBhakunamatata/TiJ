package Ch13.Exercise.pets;

import Ch13.Exercise.factory.Factory;
import java.util.*;

public class FactoryPetCreator extends PetCreator {
    private static List<Factory<? extends Pet>> types = new ArrayList<>();
    private static Random random = new Random();
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

    public static Pet createPet() {
        int n = random.nextInt(types.size());
        return types.get(n).create();
    }
}
