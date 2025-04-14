package Ch09.Exercises;

/*
 * Create a class with a private field and a private method. Create an
inner class with a method that modifies the outer-class field and calls the outer-class method.
In a second outer-class method, create an object of the inner class and call its method, then
show the effect on the outer-class object.
 */

public class Exercise07 {

    private int i = 0;
    private void f(){
        System.out.println("Calling function in Outer class");
    }
    class Inner {
        void innerFun(){
            i++;
            System.out.println("Calling f() in Inner class");
            f();
        }
    }

    void f2() {
        Inner inner = new Inner();
        inner.innerFun();
    }

    @Override
    public String toString() {
        return "" + i;
    }

    public static void main(String[] args) {
        Exercise07 exercise = new Exercise07();
        exercise.f2();
        System.out.println("Now i = " + exercise);
    }
}
