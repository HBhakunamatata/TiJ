package Ch14.Exercise;

/*
  Create a holder class that holds three objects of the same type,
  along with the methods to store and fetch those objects
  and a constructor to initialize all three.
 */


import Ch13.Exercise.pets.*;

import java.util.Arrays;

public class Exercise02 <T> {
    private Object [] items;

    public Exercise02(T first, T second, T third) {
        items = new Object [3];
        items[0] = first;
        items[1] = second;
        items[2] = third;
    }

    public void put (T item, int index) {
        if (index >= 0 && index < 3) {
            items[index] = item;
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public T get (int index) {
        if (index >= 0 && index < 3) {
            return (T) items[index];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public String toString() {
        return "Exercise02{" +
                "items=" + Arrays.toString(items) +
                '}';
    }

    public static void main(String[] args) {
        Exercise02 <Pet> pets = new Exercise02<>(
                new Dog(), new Cat(), new Mouse()
        );
        Pet first = pets.get(1);
        System.out.println(pets);

    }
}
