package Ch09.Exercises;

interface Showable {
    void show();
    class Tester {
        public static void test(Showable s){
            s.show();
        }
    }
}

public class Exercise21 implements Showable {
    @Override
    public void show() {
        System.out.println("show something");
    }

    public static void main(String[] args) {
        Exercise21 exercise = new Exercise21();
        new Tester().test(exercise);
    }
}
