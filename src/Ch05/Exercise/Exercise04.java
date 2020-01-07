package Ch05.Exercise;

import Ch05.Exercise.Exercise4.Animal;

class Dog extends Animal {
    @Override
    protected void bite() {
        System.out.println("Dog bite ...");
    }
}

public class Exercise04 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Dog dog1 = new Dog();
        dog1.bite();

        ((Dog)dog).bite();
    }
}
