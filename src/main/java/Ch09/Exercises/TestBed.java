package Ch09.Exercises;

public class TestBed {
    public void f() {
        System.out.println("calling f()...");
    }

    public static class Tester {
        public static void main(String[] args) {
            new TestBed().f();
        }
    }
}
