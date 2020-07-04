package Ch13.Exercise.pets;

import java.util.List;

public class Pets {
    public static final PetCreator creator
            = new LiteralPetCreator();
    public static Pet randomPet() {
        return creator.randomPet();
    }
    public static Pet [] createArray(int size) {
        return creator.createArray(size);
    }
    public static List<Pet> createList(int size) {
        return creator.arrayList(size);
    }
}
