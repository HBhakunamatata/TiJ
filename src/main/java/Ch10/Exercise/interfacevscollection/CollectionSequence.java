package Ch10.Exercise.interfacevscollection;

import Ch13.Exercise.pets.Pet;
import Ch13.Exercise.pets.Pets;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/**
 * @description:
 * @author: Mr.Han
 * @create: 2025-07-06 15:55
 */

public class CollectionSequence extends AbstractCollection<Pet> {

    private final Pet[] pets = Pets.createArray(8);

    @Override
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public int size() {
        return pets.length;
    }

    public static void main(String[] args) {
        CollectionSequence sequence = new CollectionSequence();

        // collection
        for (Pet pet : sequence) {
            System.out.print(pet + " ");
        }
        System.out.println();

        // Iteration
        Iterator<Pet> iterator = sequence.iterator();
        while (iterator.hasNext()) {
            Pet pet = iterator.next();
            System.out.print(pet + " ");
        }
    }
}
