package Ch02_Operator.Exercise;

/*
 * Target : see the comparison of the reference using == and equals()
 *
 * Exercise 5:
 *
 * (1) Create a class called Dog containing two Strings: name and says.
 * In main( ), create two dog objects with names “spot” (who says, “Ruff!”)
 * and “scruffy” (who says, “Wurf!”). Then display their names and what they say.
 *
 * Exercise 6:
 *
 * (3) Following Exercise 5, create a new Dog reference and assign it to spot’s object.
 *  Test for comparison using == and equals() for all references.
 */

import static  net.mindview.util.Print.*;

class Dog{
    String name;
    String say;
    Dog(String name, String say){
        this.name = name;
        this.say = say;
    }
}

public class Exercise5 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("spot", "Ruff");
        Dog dog2 = new Dog("scruffy", "Wurf");

        print("Dog1 " + dog1.name + " says: " + dog1.say);
        print("Dog2 " + dog2.name + " says: " + dog2.say);

        Dog copyDog = dog1;
        System.out.println(dog1 == copyDog);
        System.out.println(dog1.equals(copyDog));
    }
}
