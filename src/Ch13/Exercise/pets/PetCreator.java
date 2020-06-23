package Ch13.Exercise.pets;

import java.util.*;

public abstract class PetCreator {
    abstract List<Class<? extends Pet>> types();

    private Random random = new Random(types().size());

    public Pet randomPet() {
        int n = random.nextInt();
        try {
            return types().get(n).newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public Pet [] createArray(int size){
        Pet [] pets = new Pet[size];
        for (int i = 0; i < size; i++) {
            pets[i] = randomPet();
        }
        return pets;
    }

    public List<Pet> arrayList (int size) {
        ArrayList<Pet> result = new ArrayList<Pet>();
        Collections.addAll(result, createArray(size));
        return result;
    }
}
