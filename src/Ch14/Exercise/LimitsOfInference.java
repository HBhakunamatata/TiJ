package Ch14.Exercise;

import Ch13.Exercise.Person;
import Ch13.Exercise.pets.Pet;

import java.util.List;
import java.util.Map;

@Deprecated
// Now the type inference has been added since java8
public class LimitsOfInference {

    static void
    f (Map<Person, List<? extends Pet>> peoplePets) { }

    public static void main(String[] args) {
        f(New.map());
    }
}