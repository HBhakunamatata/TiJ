package Ch09.Exercises;

// Repeat Exercise 9 using an anonymous inner class.
/*
 * Create an interface with at least one method, and implement that
 * interface by defining an inner class within a method,
 * which returns a reference to your interface.
 */


public class Exercise13 {
    public Tea getRedTea(){
        return new Tea() {
            String name = "RedTea";
            @Override
            public void drink() {
                System.out.println("Drinking " + name());
            }

            @Override
            public String name() {
                return name;
            }
        };
    }

    public static void main(String[] args) {
        Exercise13 exercise = new Exercise13();
        Tea tea = exercise.getRedTea();
        tea.drink();
    }
}
