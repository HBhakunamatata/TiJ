package Ch09.Exercises;

/*
 * Repeat the exercise09 but define the inner class
 * within a scope within a method.
 * This will lead to a error
 */

public class Exercise10 {
    public void buyTea(String kind) {

        {
            class RedTea implements Tea {
                private String name;

                RedTea(String label) {
                    name = label;
                }

                @Override
                public void drink() {
                    System.out.println("Drink RedTea..");
                }

                @Override
                public String name() {
                    return name;
                }

                public Tea getTea(String label) {
                    return new RedTea(label);
                }
            }
        }
        /*
        // we cannot get the class RedTea because out of the scope
        Tea tea1 = new RedTea(kind);
        System.out.println(tea1.name());
        tea1.drink();
         */
    }

    public static void main(String[] args) {
        Exercise10 exercise = new Exercise10();
        exercise.buyTea("dahonggpao");
    }
}
