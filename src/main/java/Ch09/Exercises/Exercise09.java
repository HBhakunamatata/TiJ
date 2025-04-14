package Ch09.Exercises;

/*
 * Create an interface with at least one method, and implement that
 * interface by defining an inner class within a method,
 * which returns a reference to your interface.
 */

interface Tea {
    void drink();
    String name();
}

public class Exercise09 {
    public void buyTea(String kind) {
        class RedTea implements Tea {
            private String name;

            RedTea(String label){
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

            public Tea getTea(String label){
                return new RedTea(label);
            }
        }
        Tea tea1 = new RedTea(kind);
        System.out.println(tea1.name());
        tea1.drink();
    }

    public static void main(String[] args) {
        Exercise09 exercise = new Exercise09();
        exercise.buyTea("dahonggpao");
    }
}
