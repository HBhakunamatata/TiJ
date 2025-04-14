package Ch09.Exercises;

// Repeat Exercise 7 using an anonymous inner class
/*
 * Create a class with a private field and a private method. Create an
inner class with a method that modifies the outer-class field and calls the outer-class method.
In a second outer-class method, create an object of the inner class and call its method, then
show the effect on the outer-class object.
 */

interface Inner{
    void innerFun();
}

public class Exercise12 {
    private int i = 11;
    private void f(){
        System.out.println("Calling f() in Outer class");
    }

    public Inner getInner() {
        return new Inner() {
            @Override
            public void innerFun() {
                System.out.println("Calling f() in inner class");
                f();
                System.out.println(i++);
            }
        };
    }

    public static void main(String[] args) {
        Exercise12 exercise = new Exercise12();
        Inner inner = exercise.getInner();
        inner.innerFun();
    }

}
