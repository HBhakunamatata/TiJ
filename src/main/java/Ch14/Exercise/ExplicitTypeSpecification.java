package Ch14.Exercise;

import Ch13.Exercise.pets.Person;
import Ch13.Exercise.pets.Pet;
import net.mindview.util.New;

import java.util.List;
import java.util.Map;

@Deprecated
public class ExplicitTypeSpecification {
    static void f(Map<Person, List<Pet>> petPeople) { }

    public static void main(String[] args) {
        f(New.<Person, List<Pet>>map());
    }
} ///:~
