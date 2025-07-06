package Ch10.Exercise.iterators;

import Ch13.Exercise.pets.Pet;
import Ch13.Exercise.pets.Pets;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

/**
 * @description:
 * @author: Mr.Han
 * @create: 2025-07-05 11:51
 */

public class CrossCollectionIteration2 {

    static void display(Iterable<Pet> iterable) {
        Iterator<Pet> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            Pet pet = iterator.next();
            System.out.print(pet.id() + ":" + pet + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Pet> pets = Pets.createList(8);
        LinkedList<Pet> linkedList = new LinkedList<>(pets);
        HashSet<Pet> hashSet = new HashSet<>(pets);
        TreeSet<Pet> treeSet = new TreeSet<>(pets);

        display(linkedList);
        display(hashSet);
        display(treeSet);
    }

}
