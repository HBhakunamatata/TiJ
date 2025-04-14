package Ch20.Exercise;


class Dog {
    String name;
    int age;
    Dog() {}
    Dog(String name) {
        this.name = name;
    }
    Dog (String name, int age) {
        this.name = name;
        this.age = age;
    }
}

interface MakeNoArgs {
    Dog make();
}

interface Make1Arg {
    Dog make (String name);
}

interface Make2Args {
    Dog make (String name, int age);
}

public class CtorReference {
    public static void main(String[] args) {
        MakeNoArgs m0 = Dog::new;
        Make1Arg m1 = Dog::new;
        Make2Args m2 = Dog::new;

        Dog dog0 = m0.make();
        Dog dog1 = m1.make("lfoe");
        Dog dog2 = m2.make("fjeie", 12);
    }
}
