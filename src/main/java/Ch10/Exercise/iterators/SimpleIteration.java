package Ch10.Exercise.iterators;

import Ch13.Exercise.pets.Pet;
import Ch13.Exercise.pets.Pets;
import java.util.Iterator;
import java.util.List;

/**
 * iterator collection
 * and iterator can remove elements
 * @description:
 * @author: Mr.Han
 * @create: 2025-07-05 11:23
 */

public class SimpleIteration {

    public static void main(String[] args) {
        List<Pet> pets = Pets.createList(8);

        Iterator<Pet> iterator = pets.iterator();
        while (iterator.hasNext()) {
            Pet pet = iterator.next();
            System.out.println(pet);
        }

        System.out.println("=================");

        for (Pet pet : pets) {
            System.out.println(pet);
        }

        System.out.println("=================");

        iterator = pets.iterator();

        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println(pets);
    }

}
