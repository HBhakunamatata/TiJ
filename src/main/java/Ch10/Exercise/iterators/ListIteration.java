package Ch10.Exercise.iterators;

import Ch13.Exercise.pets.Pet;
import Ch13.Exercise.pets.Pets;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @description:
 * @author: Mr.Han
 * @create: 2025-07-05 14:09
 */

public class ListIteration {

    public static void main(String[] args) {
        List<Pet> pets = Pets.createList(8);
        ListIterator<Pet> listIterator = pets.listIterator();
        while (listIterator.hasNext()) {
            Pet pet = listIterator.next();
            System.out.println(pet.toString() + ": [" + listIterator.previousIndex()
                + ", " + listIterator.nextIndex() + "]");
        }
        System.out.println("===================");

        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous().id() + " ");
        }

        System.out.println("\n==================");

        System.out.println("Before : " + pets);
        listIterator = pets.listIterator(3);
        while (listIterator.hasNext()) {
            listIterator.next();
            listIterator.set(Pets.randomPet());
        }
        System.out.println("After : " + pets);
    }

}
