package Ch09.Exercises;

public class Exercise20 implements ClassInInterface{
    @Override
    public void howdy() {
        System.out.println("Exercise20 calls howdy()");
    }

    public static void main(String[] args) {
        new Test().howdy();
        new Exercise20().howdy();
    }
}
