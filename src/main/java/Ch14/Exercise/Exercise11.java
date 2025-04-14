package Ch14.Exercise;

/*
 * Test New.java by creating your own classes and
 * ensuring that New will work properly with them.
 */

import Ch13.Exercise.pets.Person;
import Ch13.Exercise.pets.Pet;
import net.mindview.util.New;

import java.util.*;

public class Exercise11 {
    public static void main(String[] args) {
        Map<Person, List<? extends Pet>> petPeople = New.map();
        // Rest of the code is the same...
    }
}
